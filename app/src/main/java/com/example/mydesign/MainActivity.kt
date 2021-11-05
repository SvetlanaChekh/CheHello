package com.example.mydesign

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textButton: Button = findViewById(R.id.text_button)
        val intent = Intent(this, ShowActivity::class.java)
        textButton.setOnClickListener{ startActivity(intent) }

    }
}