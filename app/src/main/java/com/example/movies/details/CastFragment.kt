package com.example.movies.details

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.movies.R
import com.example.movies.adapters.CastAdapter
import com.example.movies.adapters.MovieAdapter
import com.example.movies.objects.Cast
import com.example.movies.objects.Movies
import com.example.movies.services.MovieModel
import kotlinx.android.synthetic.main.cast_fragment.*
import kotlinx.android.synthetic.main.movie_fragment.*

class CastFragment(positionId: Int) : Fragment(R.layout.cast_fragment) {

    private val moviePosition = positionId

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewModel = MovieModel()
        viewModel.movieLiveData.observe(
            viewLifecycleOwner,
            {
                cast_item.layoutManager =
                    LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
                cast_item.adapter = CastAdapter(it.movies[moviePosition].cast as ArrayList<Cast>)
            }
        )
        viewModel.getMovies()
    }
}