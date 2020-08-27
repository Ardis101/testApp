package com.example.eventexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myButton.setOnClickListener(){
            statusText.text = "Hello"

        }

        myButton.setOnLongClickListener(){
            statusText.text = "Long"
            true
        }
    }
}



