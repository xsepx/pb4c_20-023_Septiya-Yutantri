package com.example.praktikum2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class PahlawanAdapter(private val pahlawanList:ArrayList<Pahlawan> )
    : RecyclerView.Adapter<PahlawanAdapter.PahlawanViewHolder>(){

    var onItemClick : ((Pahlawan) -> Unit)? = null

    class PahlawanViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView: ImageView= itemView.findViewById(R.id.imageView)
        val textView: TextView=itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PahlawanAdapter.PahlawanViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_item, parent, false)
        return PahlawanViewHolder(view)
    }

    override fun onBindViewHolder(holder: PahlawanViewHolder, position: Int) {
        val Pahlawan = pahlawanList[position]
        holder.imageView.setImageResource(Pahlawan.image)
        holder.textView.text = Pahlawan.name

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(Pahlawan)
        }
    }

    override fun getItemCount(): Int {
        return pahlawanList.size
    }

}