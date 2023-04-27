package com.example.a2_month_lesson8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.a2_month_lesson8.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    companion object {
        const val KEY_FOR_LOGIN = "login"
        const val KEY_FOR_PASSWORD = "password"
    }

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListener()
    }

    private fun initListener() {
        binding.btnLogin.setOnClickListener {
            findNavController().navigate(
                LoginFragmentDirections.actionLoginFragmentToMainFragment(
                    User(binding.etLogin.text.toString(), binding.etPassword.text.toString())
                )
            )
        }
    }


}