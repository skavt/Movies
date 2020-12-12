package com.example.movies.movies

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.movies.R
import com.example.movies.adapters.MovieItemAdapter
import com.example.movies.api.JsonApi
import com.example.movies.objects.MoviesInfo
import kotlinx.android.synthetic.main.movie_item_fragment.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MovieItemFragment : Fragment(R.layout.movie_item_fragment) {

    private val listOfMovies = ArrayList<MoviesInfo>()
    private var jsonApi = JsonApi.create().getMovies()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        movie_item.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        movie_item.adapter = MovieItemAdapter(listOfMovies)

        jsonApi.enqueue(object : Callback<MoviesInfo> {
            override fun onResponse(call: Call<MoviesInfo>, response: Response<MoviesInfo>) {
                Log.d("Successssssssssss", response.body().toString())
            }

            override fun onFailure(call: Call<MoviesInfo>, t: Throwable) {
                Log.d("Errorrrrrrrrrrrrrr", t.message.toString())
            }
        })
    }
}