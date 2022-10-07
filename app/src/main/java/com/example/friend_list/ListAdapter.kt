package com.example.friend_list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(private val listFriends: Array<String>): RecyclerView.Adapter<ListAdapter.ViewHolder>(){
    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        val number = itemView.findViewById(R.id.number) as TextView
        val name = itemView.findViewById(R.id.name) as TextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val viewItem = inflater.inflate(R.layout.friend_list, parent, false)
        return ViewHolder(viewItem)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val listFriend = listFriends[position]

        holder.number.text = (position+1).toString()
        holder.name.text = listFriend
    }

    override fun getItemCount(): Int {
        return this.listFriends.size
    }
}