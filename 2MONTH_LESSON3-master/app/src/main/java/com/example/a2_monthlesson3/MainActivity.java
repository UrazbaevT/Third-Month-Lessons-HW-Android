package com.example.a2_monthlesson3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView contactRecyclerView;
    private ArrayList<String> contactList = new ArrayList<>();
    private ContactAdapter adapter = new ContactAdapter(contactList);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactRecyclerView = findViewById(R.id.recycler_view);
        loadData();
        contactRecyclerView.setAdapter(adapter);
    }

    private void loadData() {
        contactList.add("Жылдыз");
        contactList.add("Рахим");
        contactList.add("Бермет");
        contactList.add("Максим");
        contactList.add("Санжар");
        contactList.add("Канбар");
        contactList.add("Тилек");
        contactList.add("Рамис");
        contactList.add("Андрей");
        contactList.add("Алибек");
        contactList.add("Гучи");
        contactList.add("Босс");
    }
}