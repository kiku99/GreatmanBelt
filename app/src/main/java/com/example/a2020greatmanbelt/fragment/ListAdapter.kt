package com.example.a2020greatmanbelt.fragment

import android.view.LayoutInflater
import androidx.appcompat.view.menu.ActionMenuItemView
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.a2020greatmanbelt.R
import com.example.a2020greatmanbelt.data.NameEntity
import kotlinx.android.synthetic.main.fragment_checklist.view.*

class ListAdapter: RecyclerView.Adapter<ListAdapter.MyViewHolder>() {

    private var nameList = emptyList<NameEntity>()

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.fragment_checklist, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = nameList[position]
        holder.itemView.yourname.text = currentItem.name
    }

    override fun getItemCount(): Int {
        return nameList.size
    }

    fun setData(name: List<NameEntity>){
        this.nameList = name
        notifyDataSetChanged()
    }
}