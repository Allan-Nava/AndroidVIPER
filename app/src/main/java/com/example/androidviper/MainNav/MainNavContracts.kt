package com.example.androidviper.MainNav

import android.content.Context
import com.example.androidviper.BaseActivity.BaseContracts
import com.example.androidviper.BaseNav.BaseNavContracts

/**
 * Created by Allan Nava on 15/05/2021.
 * Updated by Allan Nava on 15/05/2021.
 */
object MainNavContracts {

    interface View :  BaseContracts.View {
    }

    interface Presenter :  BaseContracts.Presenter {
        fun handleUserState()
        fun didSelectedHome()
    }

    interface Interactor : BaseContracts.Interactor {
        var context: Context?
        //fun findUser()
    }

    interface Router : BaseNavContracts.Router {
        //fun presentLoginView()
    }

}