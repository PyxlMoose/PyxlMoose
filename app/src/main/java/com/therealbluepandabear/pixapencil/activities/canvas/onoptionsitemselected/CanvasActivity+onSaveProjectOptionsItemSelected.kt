package com.therealbluepandabear.pixapencil.activities.canvas.onoptionsitemselected

import android.app.Activity
import com.therealbluepandabear.pixapencil.activities.canvas.*
import com.therealbluepandabear.pixapencil.converters.BitmapConverter
import com.therealbluepandabear.pixapencil.database.AppData
import com.therealbluepandabear.pixapencil.extensions.resize
import com.therealbluepandabear.pixapencil.fragments.canvas.pixelGridViewInstance
import com.therealbluepandabear.pixapencil.models.PixelArt
import com.therealbluepandabear.pixapencil.utility.general.FileHelperUtilities
import com.therealbluepandabear.pixapencil.utility.InternalBitmapFileNameGenerator
import com.therealbluepandabear.pixapencil.utility.constants.ObjectConstants
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

fun CanvasActivity.onSaveProjectOptionsItemSelected(quietly: Boolean = false) {
    saved = true

    val bmp = getCoverImageBitmap().resize(0.45)
    val coverBMPFileName = InternalBitmapFileNameGenerator.generate(projectTitle!!)

    val fileHelperInstance = FileHelperUtilities.createInstance(this)
    fileHelperInstance.storeBitmapToInternalStorage(coverBMPFileName, bmp)

    if (index == -1) {
        CoroutineScope(Dispatchers.IO).launch {
            AppData.pixelArtDB.pixelArtCreationsDao().insertPixelArt(
                PixelArt(
                    coverBMPFileName,
                    BitmapConverter.convertBitmapToString(
                        pixelGridViewInstance.pixelGridViewBitmap
                    ),
                    width,
                    height,
                    pixelGridViewInstance.dimenCW,
                    pixelGridViewInstance.dimenCH,
                    outerCanvasInstance.getCurrentRotation(),
                    title.toString(),
                    false
                )
            )
        }
    } else {
        pixelGridViewInstance.invalidate()

        ObjectConstants.CurrentPixelArtObj.coverBitmapFilePath = coverBMPFileName
        ObjectConstants.CurrentPixelArtObj.bitmap = BitmapConverter.convertBitmapToString(pixelGridViewInstance.pixelGridViewBitmap)
        ObjectConstants.CurrentPixelArtObj.rotation = outerCanvasInstance.getCurrentRotation()

        CoroutineScope(Dispatchers.IO).launch {
            AppData.pixelArtDB.pixelArtCreationsDao().updatePixelArtCreation(ObjectConstants.CurrentPixelArtObj)
        }

        outerCanvasInstance.rotate(0)
    }

    if (!quietly) {
        (this as Activity).onBackPressed()
    }
}