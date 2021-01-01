package com.reo.running.havivid

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recyclerview_item.view.*

class RecyclerAdapter(var todos:Array<String>) : RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>(){

    class RecyclerViewHolder(val view:View):RecyclerView.ViewHolder(view) {
        val sampleImg = view.sampleImg
        val sampleTxt = view.sampleTxt
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val layoutinflater = LayoutInflater.from(parent.context)
        val item = layoutinflater.inflate(R.layout.recyclerview_item,parent,false)
        return RecyclerViewHolder(item)
    }

    override fun getItemCount(): Int = todos.size

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.view.let {
            it.sampleImg.setImageResource(R.mipmap.ic_launcher_round)
            it.sampleTxt.text = todos[position]
        }
    }
}