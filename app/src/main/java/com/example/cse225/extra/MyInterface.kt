package com.example.cse225.extra

import com.example.cse225.extra.models.QuoteList
import retrofit2.http.GET

interface myInterface {
    @GET("/quotes")
    suspend fun getQuotes() : retrofit2.Response<QuoteList>
}