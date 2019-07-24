package com.example.listcaffe

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.single_caffe_layout.view.*


class CaffeRecyclerAdapter(var ctx : Context, var list: ArrayList<Caffe>) :
    RecyclerView.Adapter<CaffeRecyclerAdapter.CaffeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CaffeViewHolder {
       var view = LayoutInflater.from(ctx).inflate(R.layout.single_caffe_layout, parent, false)
        return CaffeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: CaffeViewHolder, position: Int) {
        val currentCaffe = list[position]
        holder.nameCaffe.text = currentCaffe.name
        holder.openTime.text = currentCaffe.openTime.toString()
        holder.closeTime.text = currentCaffe.closeTime.toString()
        holder.daysOpened.text = currentCaffe.daysOpened
    }

    inner class CaffeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var nameCaffe = itemView.findViewById<TextView>(R.id.namecaffe)
        var openTime = itemView.findViewById<TextView>(R.id.openTime)
        var closeTime = itemView.findViewById<TextView>(R.id.closeTime)
        var daysOpened = itemView.findViewById<TextView>(R.id.daysOpen)


    }


}
