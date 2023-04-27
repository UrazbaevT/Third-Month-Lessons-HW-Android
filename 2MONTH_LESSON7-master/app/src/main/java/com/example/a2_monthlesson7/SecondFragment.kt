package com.example.a2_monthlesson7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.a2_monthlesson7.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    companion object{
        const val USERNAME = "USERNAME"
        const val PASSWORD = "PASSWORD"
        const val USER = "USERNAME"
    }

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val username = arguments?.getString("USERNAME")
        binding.tvResult.text = username

        initListener()
    }

    private fun initListener() {
        binding.btnGo.setOnClickListener {
/*            binding.apply {
           findNavController().navigate(R.id.thirdFragment, bundleOf(USERNAME to binding.etUsername.text.toString(), PASSWORD to binding.etPassword.text.toString()))
            } */
                val user = User(binding.etUsername.text.toString(), binding.etPassword.text.toString())
                findNavController().navigate(R.id.thirdFragment, bundleOf(USER to user))

        }
    }
}