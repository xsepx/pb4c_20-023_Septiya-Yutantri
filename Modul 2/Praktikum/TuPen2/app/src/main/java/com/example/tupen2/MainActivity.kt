package com.example.tupen2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imgButtonAdd=findViewById<ImageButton>(R.id.imgButtonAdd)
        imgButtonAdd.setOnClickListener {
           Toast.makeText(this, "Data Diinput", Toast.LENGTH_LONG).show()
        }
    }
}