package com.example.androidviper.BaseNav

import com.example.androidviper.BaseActivity.BaseContracts

/**
 * Created by Allan Nava on 15/05/2021.
 * Updated by Allan Nava on 15/05/2021.
 */
object BaseNavContracts  {

    interface View :  BaseContracts.View {

    }

    interface Presenter :  BaseContracts.Presenter {
        fun showHomePage()
    }

    interface RemoteDataManager :  BaseContracts.Interactor {

    }

    interface RemoteDataManagerOutput :  BaseContracts.InteractorOutput {

    }

    interface Interactor :  BaseContracts.Interactor {

    }

    interface InteractorOutput :  BaseContracts.InteractorOutput {

    }

    interface Router :  BaseContracts.Router {

    }

}