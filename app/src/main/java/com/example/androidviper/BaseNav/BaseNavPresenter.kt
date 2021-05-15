package com.example.androidviper.BaseNav

import android.app.Activity
import android.os.Bundle

/**
 * Created by Allan Nava on 15/05/2021.
 * Updated by Allan Nava on 15/05/2021.
 */
class BaseNavPresenter :  BaseNavContracts.Presenter, BaseNavContracts.InteractorOutput {

    var baseView:  BaseNavContracts.View? = null
    var baseInteractor: BaseNavInteractor = BaseNavInteractor(this)
    var baseRouter:  BaseNavContracts.Router? = null

    //region Lifecycle
    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)

        //the view can be a activity or a fragment, that's why this getActivityContext method is needed
        val activity = baseView?.getActivityContext() as? Activity ?: return
        baseRouter =  BaseNavRouter(activity)

        bundle?.let {
            //you can delete this if there's no need to get extras from the intent
        }
    }
    override fun onDestroy() {
        baseView = null
        baseInteractor?.unregister()
        //baseInteractor = null
        baseRouter?.unregister()
        baseRouter = null
    }

    //endregion

    //region Presenter

    override fun showHomePage() {
        //baseRouter?.presentHomePage()
    }

    // endregion

}