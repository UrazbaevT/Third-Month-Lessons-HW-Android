package com.example.a2monthhw4;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class MovieViewHolder extends RecyclerView.ViewHolder {

    private ImageView movieImageView;
    private TextView movieTitleTextView;
    private TextView movieDescriptionTextView;
    private TextView movieRating;
    CardView cardView;

    public MovieViewHolder(@NonNull View itemView) {
        super(itemView);
        movieImageView = itemView.findViewById(R.id.movie_iv);
        movieTitleTextView = itemView.findViewById(R.id.movie_title_tv);
        movieDescriptionTextView = itemView.findViewById(R.id.movie_desk_tv);
        movieRating = itemView.findViewById(R.id.movie_rating_tv);
        cardView = itemView.findViewById(R.id.movie_item);
    }

    public void bind(int image, String title, String description, String rating){
        movieImageView.setImageResource(image);
        movieTitleTextView.setText(title);
        movieDescriptionTextView.setText(description);
        movieRating.setText(rating);
    }
}
