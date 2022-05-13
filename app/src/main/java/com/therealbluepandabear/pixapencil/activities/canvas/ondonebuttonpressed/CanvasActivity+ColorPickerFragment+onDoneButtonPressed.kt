package com.therealbluepandabear.pixapencil.activities.canvas.ondonebuttonpressed

import android.graphics.Color
import com.therealbluepandabear.pixapencil.activities.canvas.CanvasActivity
import com.therealbluepandabear.pixapencil.activities.canvas.binding
import com.therealbluepandabear.pixapencil.activities.canvas.fromDB
import com.therealbluepandabear.pixapencil.activities.canvas.setPixelColor
import com.therealbluepandabear.pixapencil.adapters.ColorPickerAdapter
import com.therealbluepandabear.pixapencil.converters.JsonConverter
import com.therealbluepandabear.pixapencil.database.AppData

fun CanvasActivity.extendedOnDoneButtonPressed(selectedColor: Int, colorPaletteMode: Boolean) {
    supportFragmentManager.popBackStackImmediate()

    if (!colorPaletteMode) {
        setPixelColor(selectedColor)
    } else {
        val newData = JsonConverter.convertJsonStringToListOfInt(fromDB!!.colorPaletteColorData).toMutableList()
        newData.add(selectedColor)

        newData.distinctBy {
            it == Color.TRANSPARENT
        }

        newData.sortBy {
            it == Color.TRANSPARENT
        }

        fromDB!!.apply {
            colorPaletteColorData = JsonConverter.convertListToJsonString(newData.toList())
        }

        AppData.colorPalettesDB.colorPalettesDao().updateColorPalette(fromDB!!)

        AppData.colorPalettesDB.colorPalettesDao().getAllColorPalettes().observe(this) {
            binding.activityCanvasColorPickerRecyclerView.adapter = ColorPickerAdapter(fromDB!!, this)

            val colorData = JsonConverter.convertJsonStringToListOfInt(fromDB!!.colorPaletteColorData).toMutableList()
            binding.activityCanvasColorPickerRecyclerView.scrollToPosition(colorData.indexOf(Color.TRANSPARENT))
        }
    }
}