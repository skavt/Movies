package com.example.movies.movies

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.movies.R
import com.example.movies.adapters.MovieItemAdapter
import com.example.movies.objects.MoviesInfo
import kotlinx.android.synthetic.main.movie_item_fragment.*

class MovieItemFragment : Fragment(R.layout.movie_item_fragment) {

    private var listOfMovies = ArrayList<MoviesInfo>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        movie_item.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        movie_item.adapter = MovieItemAdapter(listOfMovies)
    }
}