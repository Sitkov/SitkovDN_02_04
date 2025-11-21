package com.dignerdranch.anroid.sitkovdn_02_04

data class Task(
    val id: Int,
    val title: String,
    val isCompleted: Boolean = false,
    val category: String // "work" или "home"
)