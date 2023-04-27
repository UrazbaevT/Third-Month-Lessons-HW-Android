package com.example.a2_month_lesson6

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.a2_month_lesson6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var list = arrayListOf<Food>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadData()
        val adapter = FoodAdapter(list, this::onClick)
        binding.recyclerView.adapter = adapter

        //binding.imageView.loadImage("https://images.hdqwalls.com/download/san-francisco-california-cityscape-4k-qv-1920x1080.jpg")

        showToast("Hello")
        showToast("World")
        showToast("!")

        //val hero = Hero("Tilek", 50, 100)

        val hero2 = Hero("Archer")
        Log.d("Ray", hero2.toString())

        val hero3 = Hero(defence = "Защита 200")
        Log.d("Ray", hero3.toString())
    }

    private fun onClick(position: Int){
        showToast(list[position].name)
    }

    private fun loadData() {
        list.add(Food("Бризоль", "https://img.povar.ru/main/af/b1/71/d7/brizol_s_ovoshami-138592.jpg"))
        list.add(Food("Плов", "https://shelkoviyput.ru/upload/iblock/628/6289e09249487748321915358d49021e.jpg"))
        list.add(Food("Босо лагман", "https://media-cdn.tripadvisor.com/media/photo-s/12/a7/fc/d9/caption.jpg"))
        list.add(Food("Фетучини", "https://vilkin.pro/wp-content/uploads/2020/01/fetuchini-s-lososem-v-slivochnom-souse.jpg"))
        list.add(Food("Манты", "https://pbs.twimg.com/media/DuH0d8XW4AE5OTi.jpg"))
        list.add(Food("Пахлава", "https://images.prom.ua/3872400831_w640_h640_turetskaya-pahlava-s.jpg"))
        list.add(Food("Бургер", "https://imgtest.mir24.tv/uploaded/images/crops/2022/June/870x489_0x105_detail_crop_20220610092626_6402a6d7_9f16470a33c6e09f507bfc3d1736f4c57c1de42528fa91078e2449381f861cd5.jpg"))
        list.add(Food("Шаурма", "https://bigbossykt.ru/wp-content/uploads/2022/08/shaurma-ostraya.jpg"))
        list.add(Food("Шорпо", "https://img.povar.ru/main/a9/06/27/f4/shorpo-409464.jpg"))
        list.add(Food("Хинкали", "https://i.obozrevatel.com/food/recipemain/2019/1/9/126.jpg"))
        list.add(Food("Тар-тар", "https://cdn.lifehacker.ru/wp-content/uploads/2021/02/10_1613059163-e1613059243759-1280x640.jpg"))
        list.add(Food("Пельмени", "https://www.restoran.ru/upload/resize_cache/iblock/8f3/604_404_11a88371ca9e7ba72ce6f5767ba9eff1a/9ldulvjlsxw.jpg"))
        list.add(Food("Чак-Чак", "https://www.gastronom.ru/binfiles/images/00000020/00020582.jpg"))
        list.add(Food("Самсы", "https://nowturkey.ru/wp-content/uploads/2022/07/570935_testo_somsa_samsa_eda_uzbekistan_myaso_10086x7097_www.gdefon.ru_.jpg"))
    }

}