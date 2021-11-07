package com.akash.etandtv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.btn)
        val editTxt = findViewById<EditText>(R.id.edbox)
        val txt = findViewById<TextView>(R.id.txt1)

        btn.setOnClickListener {
            val s = editTxt.text.toString()
            if (s != ""){
                txt.text = s
            }
        }
    }

   
}