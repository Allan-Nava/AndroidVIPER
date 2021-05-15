package com.example.androidviper.Home

import android.content.Context
import com.example.androidviper.BaseActivity.BaseActivity
import com.example.androidviper.BaseActivity.BaseContracts

/**
 * Created by Allan Nava on 15/05/2021.
 * Updated by Allan Nava on 15/05/2021.
 */
object HomeContracts {

    interface View :  BaseContracts.View {
        fun showLoadingData(isLoading: Boolean)
    }

    interface Presenter :  BaseContracts.Presenter {
        var view: HomeContracts.View?
        fun loadData()
        fun isLoadingData()
    }

    interface Interactor :  BaseContracts.Interactor {
        var context: Context?
    }

    interface InteractorOutput :  BaseContracts.InteractorOutput {
        //fun foundHome(home: HomeViewModel)
    }

    interface Router :  BaseContracts.Router {

    }

    interface LocalDataManager :  BaseContracts.Interactor {

    }

    interface RemoteDataManager :  BaseContracts.Interactor {

    }

    interface RemoteDataManagerOutput :  BaseContracts.InteractorOutput {

    }

}