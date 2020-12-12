package com.example.movies.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.movies.R
import com.example.movies.objects.MoviesInfo

class MovieItemAdapter(
    private val movieList: ArrayList<MoviesInfo>,
    private val context: Context
) :
    RecyclerView.Adapter<MovieItemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setContent(movieList[position])
    }

    override fun getItemCount(): Int = movieList.size

    private fun getImage(imageName: String): Int =
        context.resources.getIdentifier(imageName, "drawable", context.packageName)

    inner class ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        fun setContent(moviesInfo: MoviesInfo) {
//            Glide.with(context).load(getImage(movieList[position])).into(holder.movieImage)
//            val movieImage: ImageView = itemView.movie_item
        }
    }
}