package com.reo.running.havivid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class Main : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // create dummy data
        val dummyData = Array<String>(10) { i -> "dummy$i"}

        // use a linear layout manager
        my_recycler_view.layoutManager = LinearLayoutManager(this)

        // set adapter
        my_recycler_view.adapter = RecyclerAdapter(dummyData)

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        my_recycler_view.setHasFixedSize(true)
    }
}