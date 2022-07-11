package com.therealbluepandabear.pixapencil.tooltests.tests

import android.graphics.Color
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.therealbluepandabear.pixapencil.activities.canvas.CanvasActivity
import com.therealbluepandabear.pixapencil.algorithms.CircleAlgorithm
import com.therealbluepandabear.pixapencil.algorithms.EllipseAlgorithm
import com.therealbluepandabear.pixapencil.extensions.getPixel
import com.therealbluepandabear.pixapencil.fragments.canvas.pixelGridViewInstance
import com.therealbluepandabear.pixapencil.models.Coordinates
import com.therealbluepandabear.pixapencil.tooltests.helper.ToolTestsHelper
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class EllipseToolTests {
    @get:Rule
    val activityRule = ActivityScenarioRule(CanvasActivity::class.java)

    @Test
    fun ett_1() {
        activityRule.scenario.onActivity {
            ToolTestsHelper.prepare(it)

            val ellipseAlgorithm = EllipseAlgorithm(it.primaryAlgorithmInfoParameter)
            ellipseAlgorithm.compute(Coordinates(0, 0), Coordinates(9, 4))

            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(2, 0)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(3, 0)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(4, 0)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(5, 0)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(6, 0)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(7, 0)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(2, 4)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(3, 4)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(4, 4)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(5, 4)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(6, 4)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(7, 4)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(1, 1)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(0, 2)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(1, 3)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(8, 1)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(9, 2)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(8, 3)) == Color.BLACK)
        }
    }

    @Test
    fun ett_2() {
        activityRule.scenario.onActivity {
            ToolTestsHelper.prepare(it)

            val ellipseAlgorithm = EllipseAlgorithm(it.primaryAlgorithmInfoParameter)
            ellipseAlgorithm.compute(Coordinates(0, 0), Coordinates(4, 9))

            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(2, 0)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(1, 1)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(3, 1)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(1, 8)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(2, 9)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(3, 8)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(0, 2)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(0, 3)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(0, 4)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(0, 5)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(0, 6)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(0, 7)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(4, 2)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(4, 3)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(4, 4)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(4, 5)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(4, 6)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(4, 7)) == Color.BLACK)
        }
    }

    @Test
    fun ett_3() {
        activityRule.scenario.onActivity {
            ToolTestsHelper.prepare(it)

            val ellipseAlgorithm = EllipseAlgorithm(it.primaryAlgorithmInfoParameter)
            ellipseAlgorithm.compute(Coordinates(0, 0), Coordinates(9, 7))

            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(2, 0)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(3, 0)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(4, 0)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(5, 0)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(6, 0)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(7, 0)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(2, 7)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(3, 7)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(4, 7)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(5, 7)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(6, 7)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(7, 7)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(1, 1)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(8, 1)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(1, 6)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(8, 6)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(0, 2)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(0, 3)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(0, 4)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(0, 5)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(9, 2)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(9, 3)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(9, 4)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(9, 5)) == Color.BLACK)
        }
    }

    @Test
    fun ett_4() {
        activityRule.scenario.onActivity {
            ToolTestsHelper.prepare(it)

            val ellipseAlgorithm = EllipseAlgorithm(it.primaryAlgorithmInfoParameter)
            ellipseAlgorithm.compute(Coordinates(0, 0), Coordinates(29, 24))

            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(15, 24)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(15, 0)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(14, 0)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(14, 24)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(16, 24)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(16, 0)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(13, 0)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(13, 24)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(17, 24)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(17, 0)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(12, 0)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(12, 24)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(18, 24)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(18, 0)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(11, 0)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(11, 24)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(19, 23)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(19, 1)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(10, 1)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(10, 23)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(20, 23)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(20, 1)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(9, 1)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(9, 23)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(21, 23)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(21, 1)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(8, 1)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(8, 23)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(22, 22)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(22, 2)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(7, 2)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(7, 22)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(23, 22)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(23, 2)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(6, 2)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(6, 22)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(24, 21)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(24, 3)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(5, 3)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(5, 21)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(25, 20)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(25, 4)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(4, 4)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(4, 20)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(26, 19)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(26, 5)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(3, 5)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(3, 19)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(27, 18)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(27, 6)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(2, 6)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(2, 18)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(28, 17)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(28, 7)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(1, 7)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(1, 17)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(28, 16)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(28, 8)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(1, 8)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(1, 16)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(29, 15)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(29, 9)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(0, 9)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(0, 15)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(29, 14)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(29, 10)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(0, 10)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(0, 14)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(29, 13)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(29, 11)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(0, 11)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(0, 13)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(29, 12)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(29, 12)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(0, 12)) == Color.BLACK)
            assert(pixelGridViewInstance.pixelGridViewBitmap.getPixel(Coordinates(0, 12)) == Color.BLACK)
        }
    }
}