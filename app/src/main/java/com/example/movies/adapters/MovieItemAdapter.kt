package com.example.movies.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.movies.R
import kotlinx.android.synthetic.main.movie_item.view.*

class MovieItemAdapter(
    private val movieList: ArrayList<String>,
    private val context: Context
) :
    RecyclerView.Adapter<MovieItemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Glide.with(context).load(getImage(movieList[position])).into(holder.movieImage)
    }

    override fun getItemCount(): Int = movieList.size

    private fun getImage(imageName: String): Int =
        context.resources.getIdentifier(imageName, "drawable", context.packageName)

    inner class ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        val movieImage: ImageView = itemView.movie_item
    }
}