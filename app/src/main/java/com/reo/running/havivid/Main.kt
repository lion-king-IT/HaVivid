package com.reo.running.havivid

import android.app.ProgressDialog.show
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import jp.co.recruit_mp.android.rmp_appirater.RmpAppirater
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.edit_layout.*

class Main : AppCompatActivity() {

    private val context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // create dummy data
        val dummyData = Array(10){""}
        // use a linear layout manager
        my_recycler_view.layoutManager = LinearLayoutManager(this)

        // set adapter
        my_recycler_view.adapter = RecyclerAdapter(dummyData)

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        my_recycler_view.setHasFixedSize(true)

        // floation action button
        val fab:View  = findViewById(R.id.fab)
        fab.setOnClickListener { view ->

            RmpAppirater.appLaunched(this)
//
//            Snackbar.make(view,"Here's a Snackbar",Snackbar.LENGTH_LONG)
//                .setAction("Action",null)
//                .show()
//
//            // TODO editTextから文字を入力したい！！
//            val builder = AlertDialog.Builder(this)
//            builder.setMessage("")
//                .setView(R.layout.edit_layout)
//                .setPositiveButton("OK") { dialog, which ->
//                tv_textView.text = et_editText.getText()
//                }
//                .show()





            fun hoge(){
                
            }


            fun foo() {

            }
             /*
            val builder = AlertDialog.Builder(context)
            val inflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.edit_layout,null)
            val editText = dialogLayout.findViewById<EditText>(R.id.et_editText)

            with(builder) {
                setTitle("Enter some text")
                setPositiveButton("OK"){dialog,which ->
                    tv_textView.text = editText.text.toString()
                    // add habit
                    //dummyData.set()
                }
                setNegativeButton("Cancel"){ dialog, which ->
                    Log.d("main","Negative button clicked")
                }
                setView(dialogLayout)
                show()
            }

             */
        }
    }
}