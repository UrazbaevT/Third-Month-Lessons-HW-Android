package com.example.a2_month_lesson4;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class BookViewHolder extends RecyclerView.ViewHolder {

    private ImageView bookImageView;
    private TextView bookTitleTextView;
    private TextView bookDescriptionTextView;
    CardView cardView;

    public BookViewHolder(@NonNull View itemView) {
        super(itemView);
        bookImageView = itemView.findViewById(R.id.book_iv);
        bookTitleTextView = itemView.findViewById(R.id.book_title_tv);
        bookDescriptionTextView = itemView.findViewById(R.id.book_desk_tv);
        cardView = itemView.findViewById(R.id.book_item);
    }

    public void bind(int image, String title, String description){
        bookImageView.setImageResource(image);
        bookTitleTextView.setText(title);
        bookDescriptionTextView.setText(description);
    }
}
