package com.example.movies.details

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.movies.R
import com.example.movies.adapters.MovieDetailedAdapter
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_movie_detailed.*

class MovieDetailedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detailed)

        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        viewPager.adapter = MovieDetailedAdapter(supportFragmentManager)

        tabLayout.setupWithViewPager(viewPager)
        tabLayout!!.addTab(tabLayout.newTab().setText("Info"))
        tabLayout.addTab(tabLayout.newTab().setText("Cast"))
    }
}