package com.example.appproject

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val a= findViewById<Button>(R.id.bt1);
        a.setOnClickListener() {
            intent = Intent(this , App2::class.java)
            startActivity(intent);


        }

    }

}