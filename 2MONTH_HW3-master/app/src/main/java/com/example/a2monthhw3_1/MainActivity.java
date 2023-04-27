package com.example.a2monthhw3_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView shopRecyclerView;
    private ArrayList<String> shopList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shopRecyclerView = findViewById(R.id.recycler_view);
        loadData();
        ShopAdapter adapter = new ShopAdapter(shopList);
        shopRecyclerView.setAdapter(adapter);
    }

    private void loadData() {
        shopList.add("Морковь");
        shopList.add("Хлеб");
        shopList.add("Кукуруза");
        shopList.add("Мясо");
        shopList.add("Овощи мощные");
        shopList.add("Шоколад просроченный");
        shopList.add("несквик");
        shopList.add("лаваш");
        shopList.add("не томатный кепчук");
        shopList.add("киндер без сюрприза");
        shopList.add("бананы");
        shopList.add("людей");
    }
}