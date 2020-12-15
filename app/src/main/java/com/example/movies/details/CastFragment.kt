package com.example.movies.details

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.movies.R
import com.example.movies.adapters.CastAdapter
import com.example.movies.objects.Cast
import kotlinx.android.synthetic.main.cast_fragment.*

class CastFragment(positionId: Int) : Fragment(R.layout.cast_fragment) {

    private val listOfCast = ArrayList<Cast>()
    private val moviePosition = positionId

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        cast_item.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        cast_item.adapter = CastAdapter(listOfCast)
    }
}