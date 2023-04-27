package com.example.a2_month_lesson8

data class User(
    val login: String? = "Неизвестное имя пользователя",
    val password: String? = "Неизвестный пароль"
): java.io.Serializable