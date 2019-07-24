package com.example.color

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btn1.setOnClickListener{
            var intent = Intent()
            intent.putExtra("selectColor", btn1.text )
            intent.setClass(this@Main2Activity , MainActivity::class.java)
            tv1.setBackgroundColor(Color.parseColor("#008000"))


            //setResult(RESULT_OK, data)
            finish()

        }
    }
}


