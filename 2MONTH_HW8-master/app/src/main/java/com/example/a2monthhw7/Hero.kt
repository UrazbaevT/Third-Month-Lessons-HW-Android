package com.example.a2monthhw7
import java.io.Serializable

data class Hero(
    val picture: String,
    val executor: String? = "Исполнителб неизвестен(на)",
    val name: String? = "Имя неизвестна"
): Serializable
