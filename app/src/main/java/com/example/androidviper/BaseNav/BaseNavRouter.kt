package com.example.androidviper.BaseNav

import android.app.Activity

/**
 * Created by Allan Nava on 15/05/2021.
 * Updated by Allan Nava on 15/05/2021.
 */
open class BaseNavRouter(override var activity: Activity?) : BaseNavContracts.Router {

    override fun unregister() {
    }

}