package com.example.a2monthhw3_1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ShopViewHolder extends RecyclerView.ViewHolder {

    private TextView tvProduct;

    public ShopViewHolder(@NonNull View itemView) {
        super(itemView);
        tvProduct = itemView.findViewById(R.id.tv_product);
    }
    public void bind(String product){
        tvProduct.setText(product);
    }
}
