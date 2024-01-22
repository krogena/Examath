package com.example.examath.adapter

import android.widget.ImageView
import com.example.examath.Indefinite
import com.example.examath.R

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.examath.IndefiniteFragment

class IndefiniteFragmentAdapter(
    private val imagesList: ArrayList<Indefinite>,
    private val context: IndefiniteFragment
): RecyclerView.Adapter<IndefiniteFragmentAdapter.Holder> (){
    class Holder(view: View) : RecyclerView.ViewHolder(view){
        val image: ImageView = itemView.findViewById(R.id.imageView1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        Glide.with(context).load(imagesList[position].icon).into(holder.image)
    }

    override fun getItemCount(): Int {
        return imagesList.size
    }
}