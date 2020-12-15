package com.example.movies.services

import com.example.movies.objects.MoviesInfo
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface JsonApi {
    @GET("movies-db/db")
    fun getMovies(): Call<MoviesInfo>

    companion object {

        var BASE_URL = "https://my-json-server.typicode.com/nikoloz14/"

        fun create(): JsonApi {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()

            return retrofit.create(JsonApi::class.java)
        }
    }
}