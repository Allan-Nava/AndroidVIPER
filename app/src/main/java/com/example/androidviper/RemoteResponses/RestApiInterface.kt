package com.example.androidviper.RemoteResponses

import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.FieldMap
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

/**
 * Created by Allan Nava on 15/05/2021.
 * Updated by Allan Nava on 15/05/2021.
 */
interface RestApiInterface {
    ///
    //@POST("api/login")
    @FormUrlEncoded
    @POST("www.example.com/auth-login/")
    fun loginUser( @FieldMap params: Map<String, String> ): Call<JsonObject>
    ///
}