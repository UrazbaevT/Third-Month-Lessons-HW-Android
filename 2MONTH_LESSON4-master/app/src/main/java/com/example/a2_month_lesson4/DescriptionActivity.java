package com.example.a2_month_lesson4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        textView = findViewById(R.id.book_info_tv);

        Intent intent = getIntent();
        textView.setText(intent.getStringExtra("desc"));
    }
}