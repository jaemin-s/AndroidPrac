package com.example.prac05app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MenuAdapter(val menuList: ArrayList<MenuModel>): RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {

    inner class MenuViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var menuTitle: TextView

        init {
            menuTitle = itemView.findViewById(R.id.tv)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent,  false)
        return MenuViewHolder(v)
    }

    override fun getItemCount(): Int {
        return menuList.size
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.menuTitle.text = menuList[position].name
    }


}