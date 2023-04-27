package com.example.a2monthhw4;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieViewHolder> {

    private ArrayList<MovieModel> movieList;
    private ItemClickListener clickListener;

    public MovieAdapter(ArrayList<MovieModel> movieList, ItemClickListener clickListener) {
        this.movieList = movieList;
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MovieViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.bind(movieList.get(position).image, movieList.get(position).title, movieList.get(position).description, movieList.get(position).rating);

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickListener.onItemClick(movieList.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }
}
