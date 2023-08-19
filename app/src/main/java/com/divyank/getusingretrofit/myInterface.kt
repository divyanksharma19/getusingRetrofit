package com.divyank.getusingretrofit
import retrofit2.http.GET
interface myInterface {
    @GET("/quotes") //end point mention
    suspend fun getQuotes() : retrofit2.Response<QuoteList>
}