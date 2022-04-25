package com.example.section10

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val btn1: Button = findViewById(R.id.btnvisibleTrue)
//        val btn2: Button = findViewById(R.id.btnvisibleFalse)
//        val textView: TextView = findViewById(R.id.textvisibleTarget)

        btnvisibleTrue.setOnClickListener{
            textvisibleTarget.visibility = View.VISIBLE
        }
        btnvisibleFalse.setOnClickListener{
            textvisibleTarget.visibility=View.INVISIBLE
        }
    }
}