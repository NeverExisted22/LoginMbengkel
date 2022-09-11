package com.example.loginmbengkel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.loginmbengkel.entity.Pesan

class RVPesanAdapter(private val data: Array<Pesan>) : RecyclerView.Adapter<RVPesanAdapter.viewHolder>(){

    override fun onCreateViewHolder(parent:ViewGroup, viewType:Int): viewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.rv_item_pesan, parent, false)
        return viewHolder(itemView)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val currentItem = data[position]
        holder.tvNamaTukang.text = currentItem.name
        holder.tvDetails.text = currentItem.namaBengkel
    }

    override fun getItemCount(): Int{
        return data.size
    }

    class viewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val tvNamaDosen : TextView = itemView.findViewById(R.id.tv_nama_tukang)
        val tvDetailsDosen : TextView = itemView.findViewById(R.id.tv_details_pesan)
    }
}