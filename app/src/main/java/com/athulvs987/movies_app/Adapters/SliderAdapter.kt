package com.athulvs987.movies_app.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.athulvs987.movies_app.R

class SliderAdapter(private val images: List<String>) :
RecyclerView.Adapter<ImageSliderAdapter.ImageSliderViewHolder>() {

    inner class ImageSliderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageSliderViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_image_slider, parent, false)
        return ImageSliderViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ImageSliderViewHolder, position: Int) {
        // Load image into ImageView using a library like Picasso, Glide, or Coil
        // Example using Glide:
        Glide.with(holder.itemView)
            .load(images[position])
            .into(holder.imageView)
    }

    override fun getItemCount(): Int = images.size
}
