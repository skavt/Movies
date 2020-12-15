package com.example.movies.details

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.movies.R
import com.example.movies.adapters.MovieAdapter
import com.example.movies.objects.Movies
import com.example.movies.services.MovieModel
import kotlinx.android.synthetic.main.info_fragment.*
import kotlinx.android.synthetic.main.movie_fragment.*
import kotlinx.android.synthetic.main.movie_item.view.*


class InfoFragment(positionId: Int) : Fragment(R.layout.info_fragment) {

    private val moviePosition = positionId

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewModel = MovieModel()
        viewModel.movieLiveData.observe(
            viewLifecycleOwner,
            {
                Glide.with(this).load(it.movies[moviePosition].imageUrl).into(movie_image)
                original_title.text = it.movies[moviePosition].title
                release_date.text = it.movies[moviePosition].date
                language.text = it.movies[moviePosition].language
                seasons.text = it.movies[moviePosition].seasons.toString()
            }
        )
        viewModel.getMovies()
    }
}