package com.example.androidviper.BaseNav

import android.os.Bundle
import android.view.View
import com.example.androidviper.BaseActivity.BaseFragment

/**
 * Created by Allan Nava on 15/05/2021.
 * Updated by Allan Nava on 15/05/2021.
 */
abstract class BaseNavFragment : BaseFragment(), BaseNavContracts.View {
    var basePresenter:  BaseNavContracts.Presenter? = null

    // region lifeCycle

    override fun onResume() {
        super.onResume()
        basePresenter?.onResume()
    }

    override fun onPause() {
        basePresenter?.onPause()
        super.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
        basePresenter?.onDestroy()
        basePresenter = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        basePresenter?.onCreate()
    }

    // endregion

}