package com.example.a2_monthlesson41;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.a2_monthlesson41.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().add(R.id.container, new FirstFragment()).commit();
        }
    }
}