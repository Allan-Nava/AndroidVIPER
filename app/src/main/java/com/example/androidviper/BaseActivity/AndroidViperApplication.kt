package com.example.androidviper.BaseActivity

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex

/**
 *   Created by Allan Nava on 15/01/2021.
 *   Updated by Allan Nava on 23/03/2021.
 **/
class AndroidViperApplication : Application() {

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext
        //
    }

    companion object {
        var appContext: Context? = null
            private set

        fun activityResumed() {
            isActivityVisible = true
        }

        fun activityPaused() {
            isActivityVisible = false
        }

        var isActivityVisible: Boolean = false
            private set

        val TAG = "AndroidViperApplication"
    }

 }