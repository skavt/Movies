package com.example.movies.details

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.movies.R
import com.example.movies.adapters.MovieDetailedAdapter
import com.google.android.material.tabs.TabLayout

class MovieDetailedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detailed)

        val viewPager = findViewById<ViewPager>(R.id.view_pager)
        val tabLayout = findViewById<TabLayout>(R.id.tab_layout)

        viewPager.adapter = MovieDetailedAdapter(supportFragmentManager)
        tabLayout.setupWithViewPager(viewPager)
    }
}