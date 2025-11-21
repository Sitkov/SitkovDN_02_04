package com.dignerdranch.anroid.sitkovdn_02_04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class WorkListScreen : AppCompatActivity() {

    // Заглушка с тестовыми данными
    private val workTasks = listOf(
        Task(1, "Подготовить отчет", false, "work"),
        Task(2, "Созвониться с клиентом", false, "work"),
        Task(3, "Проверить почту", true, "work"),
        Task(4, "Запланировать встречу", false, "work")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work_list_screen)

        setupRecyclerView()
        setupClickListeners()
    }

    private fun setupRecyclerView() {
        val adapter = TaskAdapter(workTasks)
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