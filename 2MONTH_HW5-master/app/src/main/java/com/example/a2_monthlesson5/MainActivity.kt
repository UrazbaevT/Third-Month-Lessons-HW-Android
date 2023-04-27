package com.example.a2_monthlesson5

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.content.Intent as Intent1

class MainActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var emailEditText: EditText
    lateinit var numberEditText: EditText

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.btnNew)
        emailEditText = findViewById(R.id.et1)
        numberEditText = findViewById(R.id.et2)


        button.setOnClickListener {
            val intent = Intent1(this, SecondActivity::class.java)
            intent.putExtra("email", emailEditText.text.toString())
            intent.putExtra("number", numberEditText.text.toString())
            startActivity(intent)
        }
    }

}