package com.example.a2monthhw7

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.a2monthhw7.databinding.ItemHeroesBinding
import kotlin.reflect.KFunction1

class HeroAdapter(
    val heroList: ArrayList<Hero>,
    val onClick: (position: Int) -> Unit
        ): Adapter<HeroAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemHeroesBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int = heroList.size

    inner class ViewHolder(private val binding: ItemHeroesBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(){
            val item = heroList[adapterPosition]
            binding.tvExecutor.text = item.executor
            binding.tvName.text = item.name
            binding.imgPhoto.loadImage(item.picture)


            itemView.setOnClickListener {
                onClick(adapterPosition)
            }
        }
    }
}