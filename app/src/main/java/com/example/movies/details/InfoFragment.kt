package com.example.movies.details

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.movies.R
import com.example.movies.objects.Movies
import kotlinx.android.synthetic.main.movie_fragment.*


class InfoFragment : Fragment(R.layout.info_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val intent = Intent(activity, MovieDetailedActivity::class.java)
        startActivity(intent)

        val id = intent.getStringExtra("movie_id").toString()
        Log.d("Success response", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")

        movie_item.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
//        movie_item.adapter = InfoAdapter()
    }
}