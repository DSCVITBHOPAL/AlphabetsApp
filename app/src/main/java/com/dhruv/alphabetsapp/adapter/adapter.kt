package com.dhruv.alphabetsapp.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.dhruv.alphabetsapp.DetailActivity
import com.dhruv.alphabetsapp.R
import com.dhruv.alphabetsapp.model.Alphabets
import java.security.AccessControlContext

class adapter(val context: Context, val dataset: List<Alphabets>) : RecyclerView.Adapter<adapter.ItemViewHolder>() {
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
            val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageButton =view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text =  context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imgResourceId)
        holder.imageView.setOnClickListener{
        val context = holder.itemView.context
            val Intent = Intent(context, DetailActivity::class.java)
            Intent.putExtra("text", holder.textView.text.toString())

            context.startActivity(Intent)
        }
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}