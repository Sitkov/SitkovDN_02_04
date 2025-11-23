package com.dignerdranch.anroid.sitkovdn_02_04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class main_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        val btnWork = findViewById<Button>(R.id.btn_go_work)
        val btnHome = findViewById<Button>(R.id.btn_go_home)

        btnWork.setOnClickListener {
            Toast.makeText(this, "Раздел: 'Работа'", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, WorkListScreen::class.java)) // Исправлено
        }

        btnHome.setOnClickListener {
            Toast.makeText(this, "Раздел: Дом", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, HomeListScreen::class.java)) // Исправлено
        }
    }
}