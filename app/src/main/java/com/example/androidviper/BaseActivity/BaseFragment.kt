package com.example.androidviper.BaseActivity

import android.content.Context
import android.content.ContextWrapper
import android.graphics.drawable.Drawable
import androidx.fragment.app.Fragment

/**
 *   Created by Allan Nava on 15/01/2021.
 *   Updated by Allan Nava on 23/01/2021.
 **/
abstract class BaseFragment: Fragment(), BaseContracts.View {

    fun getBaseActivity():  BaseActivity? {
        var context = context
        while (context is ContextWrapper) {
            if (context is BaseActivity) {
                return context
            }
            context = context.baseContext
        }
        return null
    }

    val mScreenWidth: Int
        get() {
            return getBaseActivity()?.getWindowManager()?.getDefaultDisplay()?.getWidth()!!
        }

    val mScreenHeight: Int
        get() {
            return getBaseActivity()?.getWindowManager()?.getDefaultDisplay()?.getHeight()!!
        }

    override fun getActivityContext(): Context? {
        return getBaseActivity()
    }

    override fun showErrorDialog(error: String?) {
        getBaseActivity()?.showErrorDialog(error)
    }

    override fun showCustomDialog( string: String, icon: Drawable? ){
        getBaseActivity()?.showCustomDialog(string, icon)
    }

    var statusBarHeight: Int = 0
        get(){
            var result = 0
            val resourceId = resources.getIdentifier("status_bar_height", "dimen", "android")
            if (resourceId > 0) {
                result = resources.getDimensionPixelSize(resourceId)
            }
            return result
        }

}