package com.example.prac05app.recycleViewPage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.prac05app.R
import com.example.prac05app.model.UserInfo

class RvAdapter(val userList: ArrayList<UserInfo>):RecyclerView.Adapter<RvAdapter.RvViewHolder>() {

    inner class RvViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var tvName: TextView
        var tvAge: TextView

        init {
            tvName = itemView.findViewById(R.id.tv_name)
            tvAge = itemView.findViewById(R.id.tv_age)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvAdapter.RvViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.rycle_item,parent,false)
        return RvViewHolder(v)
    }

    override fun onBindViewHolder(holder: RvAdapter.RvViewHolder, position: Int) {
        holder.tvName.text = userList[position].name
        holder.tvAge.text = userList[position].age.toString()
    }

    override fun getItemCount(): Int {
        return userList.size
    }


}