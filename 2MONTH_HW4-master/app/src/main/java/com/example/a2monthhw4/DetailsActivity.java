package com.example.a2monthhw4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;

import java.util.ArrayList;

public class DetailsActivity extends AppCompatActivity {

    private TextView textView;
    private TextView textView2;
    private TextView textView3;
    private ImageView imageView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        textView = findViewById(R.id.details_desc_tv);
        textView2 = findViewById(R.id.details_title_tv);
        imageView = findViewById(R.id.details_img);

        String rating = getIntent().getStringExtra("rating");
        ((TextView) findViewById(R.id.details_rating_tv)).setText(rating + "⭐");

        Intent intent = getIntent();
        Intent intent2 = getIntent();
        textView.setText(intent.getStringExtra("desc"));
        textView2.setText(intent.getStringExtra("title"));
        imageView.setImageResource(intent.getIntExtra("img", 0));

    }
}