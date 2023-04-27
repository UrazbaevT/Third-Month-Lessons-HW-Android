package com.example.a2_monthlesson7
import java.io.Serializable
data class User(
    val username: String? = "Неизвестное имя",
    val password: String? = "Неизвестный пароль"
): Serializable
