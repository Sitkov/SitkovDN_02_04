package com.dignerdranch.anroid.sitkovdn_02_04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class sing_in_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_in_screen)

        val etEmail = findViewById<EditText>(R.id.et_email)
        val etPassword = findViewById<EditText>(R.id.et_password)
        val btnLogin = findViewById<Button>(R.id.btn_login)

        btnLogin.setOnClickListener {
            val email = etEmail.text.toString()
            val pass = etPassword.text.toString()

            if(email == "adm" && pass == "123123") {
                startActivity(Intent(this, main_screen::class.java))
                Toast.makeText(this, "Успешный вход", Toast.LENGTH_SHORT).show()
            } else if(email == "" || pass == ""){
                Toast.makeText(this, "Заполните все поля", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Неверный логин или пароль", Toast.LENGTH_SHORT).show()
            }
        }
    }
}