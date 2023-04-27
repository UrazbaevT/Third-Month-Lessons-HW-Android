package com.example.a2monthhw3_1;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ShopAdapter extends RecyclerView.Adapter<ShopViewHolder> {

    private ArrayList<String> shopList;

    public ShopAdapter(ArrayList<String> shopList) {
        this.shopList = shopList;
    }

    @NonNull
    @Override
    public ShopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ShopViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_shop, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ShopViewHolder viewHolder, int position) {
        viewHolder.bind(shopList.get(position));
    }

    @Override
    public int getItemCount() {
        return shopList.size();
    }
}
