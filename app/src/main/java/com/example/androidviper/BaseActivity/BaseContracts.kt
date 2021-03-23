package com.example.androidviper.BaseActivity

import android.app.Activity
import android.content.Context
import android.graphics.drawable.Drawable
import android.os.Bundle

/**
 *   Created by Allan Nava on 15/01/2021.
 *   Updated by Allan Nava on 23/03/2021.
 **/
object BaseContracts {

    interface View {
        fun getActivityContext(): Context?
        fun showErrorDialog(error: String?)
        fun showCustomDialog( string: String, icon: Drawable? )
    }

    interface Presenter {
        fun onCreate(bundle: Bundle? = null) {}
        fun onResume() {}
        fun onPause() {}
        fun onDestroy()
    }

    interface Interactor {
        fun unregister()
    }

    interface InteractorOutput //does nothing for now

    interface Router {
        var activity: Activity?
        fun unregister()
    }


}