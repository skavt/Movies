package com.example.movies.movies

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.movies.R
import com.example.movies.adapters.MovieAdapter
import com.example.movies.objects.Movies
import com.example.movies.services.MovieModel
import kotlinx.android.synthetic.main.movie_fragment.*

class MovieFragment : Fragment(R.layout.movie_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewModel = MovieModel()
        viewModel.movieLiveData.observe(
            viewLifecycleOwner,
            {
                movie_item.layoutManager =
                    LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
                movie_item.adapter = MovieAdapter(it.movies as ArrayList<Movies>)
            }
        )
        viewModel.getMovies()
    }
}