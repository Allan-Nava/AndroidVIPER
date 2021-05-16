package com.example.androidviper.MainNav

import android.app.Activity
import com.example.androidviper.BaseNav.BaseNavRouter

/**
 * Created by Allan Nava on 15/05/2021.
 * Updated by Allan Nava on 16/05/2021.
 */
class MainNavRouter(override var activity: Activity?) : BaseNavRouter(activity = activity),  MainNavContracts.Router {

    override fun unregister() {
    }

}