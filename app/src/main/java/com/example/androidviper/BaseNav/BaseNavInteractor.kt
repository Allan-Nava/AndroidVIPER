package com.example.androidviper.BaseNav

/**
 * Created by Allan Nava on 15/05/2021.
 * Updated by Allan Nava on 15/05/2021.
 */
open class BaseNavInteractor (var output:  BaseNavContracts.InteractorOutput?) :  BaseNavContracts.Interactor,
    BaseNavContracts.RemoteDataManagerOutput {

    private val TAG = "BaseNavInteractor"
    var remoteDataManager = BaseNavRemoteDataManager(this)


    override fun unregister() {
        output = null
    }

    //region Interactor

    // endregion


}