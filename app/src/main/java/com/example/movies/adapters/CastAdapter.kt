package com.example.movies.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.movies.R
import com.example.movies.objects.Cast
import kotlinx.android.synthetic.main.cast_item.view.*

class CastAdapter(
    private val castList: ArrayList<Cast>
) :
    RecyclerView.Adapter<CastAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.cast_item, parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setContent(castList[position])
    }

    override fun getItemCount(): Int = castList.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun setContent(cast: Cast) {
            with(cast) {
                itemView.full_name.text = fullName
                itemView.role_name.text = role
                Glide.with(itemView.context).load(imageUrl).into(itemView.cast_image)
            }
        }
    }
}