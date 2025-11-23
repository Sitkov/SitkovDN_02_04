package com.dignerdranch.anroid.sitkovdn_02_04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeListScreen : AppCompatActivity() {

    // Заглушка с тестовыми данными
    private val homeTasks = listOf(
        Task(1, "Купить продукты", false, "home"),
        Task(2, "Починить кран", false, "home"),
        Task(3, "Позвонить родителям", true, "home"),
        Task(4, "Почитать книгу", false, "home")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_list_screen)

        setupRecyclerView()
        setupClickListeners()
    }

    private fun setupRecyclerView() {
        val adapter = TaskAdapter(homeTasks)
        val recyclerView = findViewById<RecyclerView>(R.id.tasks_recyclerview)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun setupClickListeners() {
        findViewById<ImageButton>(R.id.back_button).setOnClickListener {
            finish()
        }
    }
}