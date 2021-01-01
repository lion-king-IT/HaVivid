package com.reo.running.havivid

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//１行分のレイアウト
class MyViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
    // 行番の奴
    val positionText: TextView = itemView.findViewById(R.id.position)
    //習慣名
    val titleText: TextView = itemView.findViewById(R.id.title)
}