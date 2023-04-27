package com.example.a2_monthlesson7

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a2_monthlesson7.databinding.FragmentSecondBinding
import com.example.a2_monthlesson7.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {

    private lateinit var binding: FragmentThirdBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(layoutInflater)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        /*val username = arguments?.getString(SecondFragment.USERNAME)
        val password = arguments?.getString(SecondFragment.PASSWORD)
        binding.tvUsernamePassword.setText("$username $password")*/

        val user = arguments?.getSerializable(SecondFragment.USER) as User
        binding.tvUsernamePassword.setText("Username: ${user.username} Password: ${user.password}")
    }
}