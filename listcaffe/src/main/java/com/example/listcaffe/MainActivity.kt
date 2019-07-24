package com.example.listcaffe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //data
        val caffeArray = ArrayList<Caffe>()
        for(i in 0 until 30){
            caffeArray.add(Caffe("name $i", 9, 16, "sunday, tuesday, thursday"))

        }

        //recyclerView
        caffeList.layoutManager = LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL, false)


        //adapter
        val adapter = CaffeRecyclerAdapter(this@MainActivity, caffeArray)
        caffeList.adapter = adapter


    }
}
