package com.example.androidviper.MainNav

import android.app.Activity

/**
 * Created by Allan Nava on 15/05/2021.
 * Updated by Allan Nava on 15/05/2021.
 */
class MainNavRouter(override var activity: Activity?)  : MainNavContracts.Router {

    override fun unregister() {
    }
}