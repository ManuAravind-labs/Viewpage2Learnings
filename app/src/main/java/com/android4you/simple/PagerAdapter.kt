package com.android4you.simple

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android4you.viewpager2learnings.R

class PagerAdapter(private val context: Context, private val images: List<Int>): RecyclerView.Adapter<PagerAdapter.PageHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PageHolder  =
            PageHolder(LayoutInflater.from(context).inflate(R.layout.page_layout, parent, false))

    override fun onBindViewHolder(holder: PageHolder, position: Int) {
        holder.imageView.setBackgroundResource(images[position])
        holder.imageView.text = (position+1).toString()
    }

    override fun getItemCount(): Int = images.size

    inner class PageHolder(view: View): RecyclerView.ViewHolder(view){
        val imageView: TextView = view.findViewById(R.id.imageView)
    }
}