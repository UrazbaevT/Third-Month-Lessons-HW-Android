package com.example.a2monthhw7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.a2monthhw7.databinding.FragmentHeroesBinding

class HeroesFragment : Fragment() {

    private lateinit var binding: FragmentHeroesBinding
    private var list = arrayListOf<Hero>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHeroesBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = HeroAdapter(list,this::onClick)
        binding.recyclerView.adapter = adapter

    }

    private fun onClick(position: Int) {
        findNavController().navigate(HeroesFragmentDirections.actionHeroesFragmentToDetailsFragment(list[position]))
    }

    private fun loadData() {
        list.add(Hero("https://static.wikia.nocookie.net/gravityfalls/images/7/74/NekcnAT_bWM.jpg/revision/latest/scale-to-width-down/300?cb=20150518134336&path-prefix=ru", "Кристен Шаал", "Мейбл Пайнс"))
        list.add(Hero("https://i.pinimg.com/originals/13/12/44/131244708248d648e4e9324542d6a303.jpg", "Джейсон Риттер", "Диппер Пайнс"))
        list.add(Hero("https://pm1.narvii.com/6850/b2fc5f4f099e4d66b87766ca8f962524d4837fe4v2_hq.jpg", "Алекс Хирш", "Стэн Пайнс"))
        list.add(Hero("https://static.wikia.nocookie.net/gravityfalls/images/3/35/S1e5_wendy_leaning_on_atm.png/revision/latest/smart/width/400/height/225?cb=20190318064910&path-prefix=ru", "Линда Карделлини", "Венди Кордрой"))
        list.add(Hero("https://static.wikia.nocookie.net/gravityfalls/images/d/d0/S1e16_grenda_happy.png/revision/latest?cb=20130522134125", "Карл Фаруоло", "Гренда"))
        list.add(Hero("https://static.wikia.nocookie.net/gravityfalls/images/c/cf/S1e4_bud_talks_to_stan.png/revision/latest?cb=20130820234951", "Стивен Рут", "Bud Gleeful"))
        list.add(Hero("https://static.wikia.nocookie.net/gravityfalls/images/c/c8/S1e5_robbie_with_guitar.png/revision/latest?cb=20160204171654", "Ти Джей Миллер", "Робби"))
        list.add(Hero("https://static.wikia.nocookie.net/gravityfalls/images/7/7b/S1e4_gideon_song.png/revision/latest?cb=20130226191200", "Туроп Ван Орман", "Малыш Гидеон"))
        list.add(Hero("https://static.wikia.nocookie.net/gravityfalls/images/7/74/Mrsgleeful.png/revision/latest?cb=20151207165356&path-prefix=ru", "Грэй Гриффин", "Миссис Глифул"))
        list.add(Hero("https://gravityfalls.ucoz.org/bdehndi.jpg", "Джастин Ройланд", "Блендин Блэндин"))

    }
}


