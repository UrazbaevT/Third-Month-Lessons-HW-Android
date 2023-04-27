package com.example.a2_month_lesson4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookViewHolder> {

    private ArrayList<BookModel> bookList;
    private ItemClickListener clickListener;

    public BookAdapter(ArrayList<BookModel> bookList, ItemClickListener clickListener) {
        this.bookList = bookList;
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BookViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.book_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        holder.bind(bookList.get(position).image, bookList.get(position).title, bookList.get(position).description);

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickListener.onItemClick(bookList.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }
}
