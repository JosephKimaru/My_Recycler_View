package com.example.myrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder> (){

    private var titles = arrayOf("Item One", "Item Two",  "Item Three", "Item Four", "Item Five",
        "Item Six", "Item Seven", "Item Eight", "Item Nine", "Item Ten", "Item Eleven", "Item Twelve",
        "Item Thirteen","Item Fourteen",)

    private var details = arrayOf("Afghanistan", "Albania", "Algeria", "Australia", "Austria", "Bahamas",
        "Barbados", "Belgium", "Brazil", "Burkina Faso", "Cambodia", "Cameroon", "Chile", "China")

    private var images = intArrayOf(R.drawable.afghanistan, R.drawable.albania, R.drawable.algeria,
        R.drawable.australia, R.drawable.austria, R.drawable.bahamas, R.drawable.barbados, R.drawable.belgium,
        R.drawable.brazil, R.drawable.burkina_faso, R.drawable.cambodia, R.drawable.cameroon, R.drawable.chile,
        R.drawable.chile)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
     val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemDetail.text = details[position]
        holder.itemImage.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    inner class ViewHolder(itemView: View ): RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.itemImage)
            itemTitle = itemView.findViewById(R.id.itemTitle)
            itemDetail = itemView.findViewById(R.id.itemData)
        }
    }

}