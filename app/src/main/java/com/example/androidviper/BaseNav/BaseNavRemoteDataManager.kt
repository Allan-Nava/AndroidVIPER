package com.example.androidviper.BaseNav

import com.example.androidviper.BaseActivity.BaseRemoteInteractor

/**
 * Created by Allan Nava on 15/05/2021.
 * Updated by Allan Nava on 15/05/2021.
 */
class BaseNavRemoteDataManager(var output:  BaseNavContracts.RemoteDataManagerOutput?):  BaseRemoteInteractor(),
    BaseNavContracts.RemoteDataManager
{

    private val TAG = "BVideoRemoDataManager"
    override fun unregister() {
        output = null
    }

}