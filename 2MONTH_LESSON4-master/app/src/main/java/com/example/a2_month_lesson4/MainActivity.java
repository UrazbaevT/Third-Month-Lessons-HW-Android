package com.example.a2_month_lesson4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener{

    private RecyclerView bookRecyclerView;
    private ArrayList<BookModel> bookList = new ArrayList<>();
    private BookAdapter bookAdapter = new BookAdapter(bookList, this);

    @SuppressLint({"ResourceType", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bookRecyclerView = findViewById(R.id.books_rv);
        loadData();
        bookRecyclerView.setAdapter(bookAdapter);
    }

    private void loadData() {
        bookList.add(new BookModel(R.drawable.ic_1, "Harry Potter", "История о мальчике со шрамомб который выжил"));
        bookList.add(new BookModel(R.drawable.ic_2, "Цветы для Элджернона", "Мужчина, который хотел стать умным человеком"));
        bookList.add(new BookModel(R.drawable.ic_3, "Жамиля", "Первая советская девушка. сбежавшая из дома"));
        bookList.add(new BookModel(R.drawable.ic_4, "Игра ангелов", "История создания религии?!"));
        bookList.add(new BookModel(R.drawable.ic_5, "Белый пароход", "Мальчик который не дождался("));
        bookList.add(new BookModel(R.drawable.ic_6, "Волк с Уолл-Стрит", "Мужчина, который зарабатывал в час 22млн$"));
        bookList.add(new BookModel(R.drawable.ic_7, "Мани или Азбука денег", "Собака, которая помогла заработать первый копитал"));
        bookList.add(new BookModel(R.drawable.ic_8, "Работа в Дубае", "Книга о том как совмещять полезное с приятный"));
        bookList.add(new BookModel(R.drawable.ic_9, "Цитаты Мао Цзэдун", "В книге собрано 427 цитат великого правителя Китайской Народной Республики"));
        bookList.add(new BookModel(R.drawable.ic_10, "Властелин колец", "Фэнтези рассказывает о магическом Кольце Всевластия, вокруг которого происходят разные перипетии. "));
    }

    @Override
    public void onItemClick(BookModel bookModel) {
        Intent intent = new Intent(this, DescriptionActivity.class);
        intent.putExtra("desc", bookModel.description);
        startActivity(intent);
    }
}