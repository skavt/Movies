package com.example.movies.api

import com.example.movies.objects.MoviesInfo
import retrofit2.Call
import retrofit2.http.GET

interface JsonApi {
    @GET("movies-db/db")
    fun getMovies(): Call<MoviesInfo>
}