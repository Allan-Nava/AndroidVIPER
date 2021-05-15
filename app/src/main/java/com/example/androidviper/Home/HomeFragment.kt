package com.example.androidviper.Home

import android.content.Context
import android.graphics.drawable.Drawable

/**
 * Created by Allan Nava on 15/05/2021.
 * Updated by Allan Nava on 15/05/2021.
 */
class HomeFragment : HomeContracts.View {



    override fun showLoadingData(isLoading: Boolean) {

    }

    override fun getActivityContext(): Context? {
       return this.getActivityContext()
    }

    override fun showErrorDialog(error: String?) {

    }

    override fun showCustomDialog(string: String, icon: Drawable?) {

    }
}