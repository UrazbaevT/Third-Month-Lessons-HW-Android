package com.example.a2_month_lesson6

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.a2_month_lesson6.databinding.ItemFoodBinding

class FoodAdapter(val foodList: ArrayList<Food>, val onClick: (position: Int) -> Unit): Adapter<FoodAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemFoodBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int = foodList.size



    inner class ViewHolder(private val binding: ItemFoodBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(){
            val item = foodList[adapterPosition]
            binding.apply {
                tvFood.text = item.name
                imgFood.loadImage(item.picture)
            }

            itemView.setOnClickListener {
                onClick(adapterPosition)
            }
        }
    }


}