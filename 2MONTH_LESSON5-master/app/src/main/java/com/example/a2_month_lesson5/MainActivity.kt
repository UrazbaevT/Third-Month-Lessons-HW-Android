package com.example.a2_month_lesson5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a2_month_lesson5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    companion object{ // ящик для static(статичных) методов, переменных

    }

    private val password: String = "1234" // неизменяемая переменная (value)
    private var username1 = "Malik"  // измменяемая переменная (variable)
    private lateinit var name: String // lateinit - поздняя инициализация // ? может быть null
    private var oleg = 18

    //private var countryList = arrayListOf("Kyrgyz", "Qatar", 123, false)
    private var countryList = arrayListOf<String>("Kyrgyzstan", "Qatar", "Turkey")

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null){
            supportFragmentManager.beginTransaction().add(R.id.container, FirstFragment()).commit()
        }




        username1 = "Tilek"
        name = "Hello"


        /*when(oleg){
            18 ->{
                println("18")
            }
            15 ->{
                println("15")
            }else ->{
                println("Hello")
            }
        }*/

        /*when (oleg) {
            18 -> println("18")
            15 -> println("15")
            else -> println("Hello")
        }*/

        for (i in countryList) { // если написать country.indices то цикл покажет индексы каждого элемента в массиве
            println(i)
        }

        for (i in 1..100) {
            println(i)
        }

        countryList.forEachIndexed{element, index ->
            println(index + element)
        }

        println(calculate(5, 8))
    }

    /*private fun calculate(x: Int, y: Int): Int { // метод
        return x + y
    }*/

    private fun calculate(x: Int, y: Int) = x + y // метод
}
