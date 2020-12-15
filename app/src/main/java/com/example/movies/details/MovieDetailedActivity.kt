package com.example.movies.details

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.movies.R
import kotlinx.android.synthetic.main.activity_movie_detailed.*

class MovieDetailedActivity  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detailed)

        tabLayout!!.addTab(tabLayout!!.newTab().setText("Info"))
        tabLayout!!.addTab(tabLayout!!.newTab().setText("Cast"))
    }
}