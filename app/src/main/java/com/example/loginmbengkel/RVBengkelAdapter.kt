package com.example.loginmbengkel
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//import com.example.loginmbengkel.entity.Bengkel
//
//class RVBengkelAdapter(private val data: Array<Bengkel>) : RecyclerView.Adapter<RVBengkelAdapter.viewHolder>() {
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
//
//        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.rv_item_bengkel, parent, false)
//        return viewHolder(itemView)
//    }
//
//    override fun onBindViewHolder(holder:viewHolder, position: Int){
//        val currentItem = data[position]
//        holder.tvNama.text = currentItem.name
//        holder.tvDetails.text = "${currentItem.tahunBerdiri} - ${currentItem.alamat}"
//    }
//
//    override fun getItemCount(): Int {
//        return data.size
//    }
//
//    class viewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
//        val tvNama : TextView = itemView.findViewById(R.id.tv_nama)
//        val tvDetails : TextView = itemView.findViewById(R.id.tv_details)
//
//    }
//}
