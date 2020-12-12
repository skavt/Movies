package com.example.movies.movies

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.movies.R
import com.example.movies.adapters.MovieItemAdapter
import com.example.movies.api.JsonApi
import com.example.movies.objects.Movies
import com.example.movies.objects.MoviesInfo
import kotlinx.android.synthetic.main.movie_item_fragment.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MovieItemFragment : Fragment(R.layout.movie_item_fragment) {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://my-json-server.typicode.com/nikoloz14/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    private val jsonApi = retrofit.create(JsonApi::class.java)
    private var call = jsonApi.getMovies()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        call.enqueue(object : Callback<MoviesInfo> {
            override fun onResponse(call: Call<MoviesInfo>, response: Response<MoviesInfo>) {
                val listOfMovies = ArrayList<MoviesInfo>()
                movie_item.layoutManager =
                    LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
                movie_item.adapter = MovieItemAdapter(listOfMovies)
                Log.d("Successssssssssss", response.body().toString())
            }

            override fun onFailure(call: Call<MoviesInfo>, t: Throwable) {
                Log.d("Errorrrrrrrrrrrrrr", t.message.toString())
            }
        })
    }
}