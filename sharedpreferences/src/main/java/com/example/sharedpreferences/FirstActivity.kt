package com.example.sharedpreferences

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        loginbtn.setOnClickListener{
            var intent = Intent()
            intent.setClass(this , LogActivity::class.java)
            startActivity(intent)

        }


    }
}
