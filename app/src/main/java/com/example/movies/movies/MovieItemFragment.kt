package com.example.movies.movies

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.movies.R
import com.example.movies.adapters.MovieItemAdapter
import kotlinx.android.synthetic.main.movie_item_fragment.*

class MovieItemFragment : Fragment(R.layout.movie_item_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        movie_item.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        movie_item.adapter = context?.let {
            MovieItemAdapter(ArrayList<String>().apply {
                add("bb")
                add("bnn")
                add("f")
                add("got")
            }, it)
        }
    }
}