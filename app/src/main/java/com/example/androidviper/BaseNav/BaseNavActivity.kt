package com.example.androidviper.BaseNav

import android.graphics.drawable.Drawable
import com.example.androidviper.BaseActivity.BaseActivity

/**
 * Created by Allan Nava on 15/05/2021.
 * Updated by Allan Nava on 15/05/2021.
 */
abstract  class BaseNavActivity : BaseActivity(), BaseNavContracts.View {

    var basePresenter:  BaseNavContracts.Presenter? = null

    //region Lifecycle

    override fun onResume() {
        super.onResume()
        basePresenter?.onResume()
    }

    override fun onPause() {
        super.onPause()
        basePresenter?.onPause()
    }

    override fun onDestroy() {
        basePresenter?.onDestroy()
        basePresenter = null
        super.onDestroy()
    }
    //endregion


    override fun showErrorDialog(error: String?) {

    }

    override fun showCustomDialog(string: String, icon: Drawable?) {

    }

}