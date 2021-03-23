package com.example.androidviper.BaseActivity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.TypedValue
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity

/**
 *   Created by Allan Nava on 15/01/2021.
 *   Updated by Allan Nava on 15/01/2021.
 **/
interface BaseOnActivityResult {
    fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?)
}
//
abstract class BaseActivity : AppCompatActivity(), BaseContracts.View {

    var loginCallBack:  BaseOnActivityResult? = null

    override fun getActivityContext(): Context? {
        return this
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Foz
    }
    override fun onResume() {
        super.onResume()
        AndroidViperApplication.activityResumed()

    }

    override fun onPause() {
        super.onPause()
        AndroidViperApplication.activityPaused()
    }

    val mScreenWidth: Int
        get() {
            return getWindowManager()?.getDefaultDisplay()?.getWidth()!!
        }

    val mScreenHeight: Int
        get() {
            return getWindowManager()?.getDefaultDisplay()?.getHeight()!!
        }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }


    fun setTopMarginForLayout(layout: View, topMargin: Int?) {
        val layoutParams = layout.layoutParams as ViewGroup.MarginLayoutParams
        layoutParams.topMargin = topMargin!!
        layout.layoutParams = layoutParams
    }

    fun setLateralMarginsForLayout(layout: View, topMargin: Int?) {
        val layoutParams = layout.layoutParams as ViewGroup.MarginLayoutParams
        layoutParams.leftMargin = topMargin!!
        layoutParams.rightMargin = topMargin

        layout.layoutParams = layoutParams
    }

    fun setHeight(layout: FrameLayout, height: Int?) {
        val layoutParams = layout.layoutParams as ViewGroup.MarginLayoutParams
        layoutParams.height = height!!
        layout.layoutParams = layoutParams
    }

    fun dpToPixel(dp: Int): Int {
        val r = resources
        val sizePx = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp.toFloat(), r.displayMetrics)
        return sizePx.toInt()
    }



}