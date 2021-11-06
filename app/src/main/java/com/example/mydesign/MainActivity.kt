package com.example.mydesign

import android.content.Intent
import android.os.Bundle
import android.widget.Button
//import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //вызовем окно стилей текста
        val showButton: Button = findViewById(R.id.show_button)
        val intent = Intent(this, ShowActivity::class.java)
        showButton.setOnClickListener { startActivity(intent) }
        // вызовем окно ассорти
        val assortiButton: Button = findViewById(R.id.assorti_button)
        val intent1 = Intent(this, AssortiActivity::class.java)
        assortiButton.setOnClickListener { startActivity(intent1) }
    }
}