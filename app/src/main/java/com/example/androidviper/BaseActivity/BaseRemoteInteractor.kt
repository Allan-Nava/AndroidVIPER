package com.example.androidviper.BaseActivity

import android.util.Log
import com.example.androidviper.RemoteResponses.RestApiInterface
import com.google.gson.GsonBuilder
import okhttp3.MediaType
import okhttp3.RequestBody

/**
 * Created by Allan Nava on 15/05/2021.
 * Updated by Allan Nava on 15/05/2021.
 */
open class BaseRemoteInteractor {
    val apiService: RestApiInterface =  ApiClient.client.create(RestApiInterface::class.java)

    /*val JSON: MediaType = "application/json; charset=utf-8".toMediaType()

    fun createBodyWith(map: Map<String, Any>?): RequestBody {
        val gson = GsonBuilder().create()
        val json = gson.toJson(map)
        Log.i("OKHTTP-Parameters", json.toString())
        return RequestBody.Companion.create( JSON, json )
        //return RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"), json.toString())
    }*/

    fun createBearerHeader(bearer: String): HashMap<String, String> {
        val map = HashMap<String, String>()
        map.put("Authorization", bearer)
        return map
    }

}