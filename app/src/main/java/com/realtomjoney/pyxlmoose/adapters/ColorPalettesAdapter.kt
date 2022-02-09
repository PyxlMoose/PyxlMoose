package com.realtomjoney.pyxlmoose.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.realtomjoney.pyxlmoose.databinding.ColorPalettesLayoutBinding
import com.realtomjoney.pyxlmoose.listeners.ColorPalettesListener
import com.realtomjoney.pyxlmoose.models.ColorPalette
import com.realtomjoney.pyxlmoose.viewholders.ColorPalettesViewHolder

class ColorPalettesAdapter(private val data: List<ColorPalette>, private val caller: ColorPalettesListener) : RecyclerView.Adapter<ColorPalettesViewHolder>()  {
    private lateinit var binding: ColorPalettesLayoutBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ColorPalettesViewHolder {
        binding = ColorPalettesLayoutBinding.inflate(LayoutInflater.from(parent.context))
        return ColorPalettesViewHolder(binding.colorPalettesLayoutRootLayout)
    }

    override fun onBindViewHolder(holder: ColorPalettesViewHolder, position: Int) = data.forEach { _ ->
        binding.colorPalettesLayoutMaterialCardView.apply parent@{
            val item = data[position]

            binding.apply {
                colorPalettesLayoutColorPaletteTitle.text = item.colorPaletteName
                val layoutManager = GridLayoutManager(context, 1).apply {
                    orientation = LinearLayoutManager.HORIZONTAL
                }
                colorPalettesLayoutColorPalettePreviewRecyclerView.layoutManager = layoutManager
                colorPalettesLayoutColorPalettePreviewRecyclerView.adapter = ColorPickerAdapter(item, null, isPreviewMode = true)
            }

            binding.colorPalettesLayoutClickDetector.setOnClickListener {
                caller.onColorPaletteTapped(item)
            }

            this@parent.setOnClickListener {
                caller.onColorPaletteTapped(item)
            }

            this@parent.setOnLongClickListener {
                caller.onColorPaletteLongTapped(item)
                true
            }

            binding.colorPalettesLayoutClickDetector.setOnLongClickListener {
                caller.onColorPaletteLongTapped(item)
                true
            }
        }
    }

    override fun getItemCount() = data.size
}