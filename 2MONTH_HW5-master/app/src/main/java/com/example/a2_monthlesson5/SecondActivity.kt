package com.example.a2_monthlesson5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    lateinit var emailTextView : TextView
    lateinit var numberTextView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        emailTextView = findViewById(R.id.tv_email)
        numberTextView = findViewById(R.id.tv_number)

        val email = intent.getStringExtra("email")
        emailTextView.text = email
        val number = intent.getStringExtra("number")
        numberTextView.text = number
    }
}