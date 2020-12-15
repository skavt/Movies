package com.example.movies.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.movies.details.CastFragment
import com.example.movies.details.InfoFragment

class MovieDetailedAdapter(fragmentManager: FragmentManager) :
    FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getCount(): Int = 2

    override fun getItem(position: Int): Fragment =
        when (position) {
            0 -> InfoFragment()
            else -> CastFragment()
        }

    override fun getPageTitle(position: Int): CharSequence =
        when (position) {
            0 -> "Info"
            else -> "Cast"
        }
}