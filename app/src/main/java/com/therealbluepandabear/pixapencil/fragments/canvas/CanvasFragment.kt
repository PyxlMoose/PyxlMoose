package com.therealbluepandabear.pixapencil.fragments.canvas

import android.graphics.Bitmap
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.therealbluepandabear.pixapencil.customviews.pixelgridview.PixelGridView
import com.therealbluepandabear.pixapencil.databinding.FragmentCanvasBinding
import com.therealbluepandabear.pixapencil.fragments.outercanvas.OuterCanvasFragment
import com.therealbluepandabear.pixapencil.utility.IntConstants

lateinit var pixelGridViewInstance: PixelGridView

class CanvasFragment : Fragment() {
    var bitmap: Bitmap? = null

    private var paramWidth: Int = IntConstants.DefaultCanvasWidthHeight
    private var paramHeight: Int = IntConstants.DefaultCanvasWidthHeight
    private var outerCanvasInstance: OuterCanvasFragment? = null
    private var paramProjectTitle: String? = null
    private var pixelArtId  = -1

    fun setParams(paramWidth: Int, paramHeight: Int, outerCanvasInstance: OuterCanvasFragment, paramProjectTitle: String?, pixelArtId: Int) {
        this.paramWidth = paramWidth
        this.paramHeight = paramHeight
        this.outerCanvasInstance = outerCanvasInstance
        this.paramProjectTitle = paramProjectTitle
        this.pixelArtId = pixelArtId
    }

    private fun setupCanvas() {
        if (outerCanvasInstance != null) {
            pixelGridViewInstance = PixelGridView(requireContext(), paramWidth, paramHeight, outerCanvasInstance!!, paramProjectTitle, pixelArtId)
            binding.fragmentCanvasRootLayout.addView(pixelGridViewInstance)
        }
    }

    companion object {
        fun newInstance(paramWidth: Int, paramHeight: Int, outerCanvasInstance: OuterCanvasFragment, paramProjectTitle: String?, pixelArtId:Int): CanvasFragment {
            val fragment = CanvasFragment()
            fragment.setParams(paramWidth, paramHeight, outerCanvasInstance, paramProjectTitle, pixelArtId)

            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding_ = FragmentCanvasBinding.inflate(inflater, container, false)

        setupCanvas()

        return binding.root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding_ = null
    }
}