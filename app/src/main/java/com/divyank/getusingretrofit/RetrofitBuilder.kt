package com.divyank.getusingretrofit


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitBuilder {
    const val api = "https://quotable.io/"   //end point already mentioned in interface

    fun getInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(api).
        addConverterFactory((GsonConverterFactory.create())).build()
    }
}


