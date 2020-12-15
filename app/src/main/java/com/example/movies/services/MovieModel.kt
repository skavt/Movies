package com.example.movies.services

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.movies.objects.MoviesInfo
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MovieModel : ViewModel() {
    private val _movieLiveData = MutableLiveData<MoviesInfo>()
    val movieLiveData: LiveData<MoviesInfo>
        get() = _movieLiveData

    fun getMovies() {
        val jsonApi = JsonApi.create().getMovies()

        jsonApi.enqueue(object : Callback<MoviesInfo> {
            override fun onResponse(call: Call<MoviesInfo>, response: Response<MoviesInfo>) {
                response.body()?.let { _movieLiveData.postValue(it) }
            }

            override fun onFailure(call: Call<MoviesInfo>, t: Throwable) {
                Log.d("Error", t.message.toString())
            }
        })
    }
}