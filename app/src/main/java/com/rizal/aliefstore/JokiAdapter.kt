package com.rizal.aliefstore

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.my_item.*

class JokiAdapter (private val context: Context, private val items: ArrayList<MyJoki>) :
    RecyclerView.Adapter<JokiAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)=ViewHolder (
                LayoutInflater.from(context).inflate(R.layout.my_item, parent, false)
        )

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items.get(position))
    }
    class ViewHolder(override val containerView:View):
        RecyclerView.ViewHolder(containerView), LayoutContainer{
            fun bindItem(item: MyJoki){
                name.text=item.nama
                email.text=item.email
                role.text=item.role
                rank.text=item.rank
            }
        }
}