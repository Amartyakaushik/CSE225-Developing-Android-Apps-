package com.example.cse225.extra

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {
    private const val api = "https://quotable.io/"
    fun getInstance() : Retrofit {
        return Retrofit.Builder()
            .baseUrl(api)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}