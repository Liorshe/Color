package com.example.color

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btncolor.setOnClickListener{
            var intent = Intent()
            intent.setClass(this@MainActivity, Main2Activity::class.java)
            startActivityForResult(intent, 1)


        }
//
//
    }
}
