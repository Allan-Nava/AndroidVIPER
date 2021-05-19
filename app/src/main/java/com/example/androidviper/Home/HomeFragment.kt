package com.example.androidviper.Home

import android.content.Context
import android.graphics.drawable.Drawable
import com.example.androidviper.BaseNav.BaseNavFragment

/**
 * Created by Allan Nava on 15/05/2021.
 * Updated by Allan Nava on 15/05/2021.
 */
class HomeFragment : BaseNavFragment(), HomeContracts.View {


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