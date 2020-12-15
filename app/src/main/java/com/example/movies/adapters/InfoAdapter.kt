package com.example.movies.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.movies.R
import com.example.movies.details.MovieDetailedActivity
import com.example.movies.objects.Movies
import kotlinx.android.synthetic.main.movie_item.view.*

class InfoAdapter(
    private val moviesList: ArrayList<Movies>
) :
    RecyclerView.Adapter<InfoAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setContent(moviesList[position])
    }

    override fun getItemCount(): Int = moviesList.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun setContent(movies: Movies) {
            with(movies) {
                itemView.movie_title.text = title
                Glide.with(itemView.context).load(imageUrl).into(itemView.movie_image)

                itemView.setOnClickListener() {
                    itemView.context.startActivity(
                        Intent(itemView.context, MovieDetailedActivity::class.java).apply {
                            putExtra("movie_id", adapterPosition.toString())
                        }
                    )
                }
            }
        }
    }
}