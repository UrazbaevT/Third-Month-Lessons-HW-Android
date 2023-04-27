package com.example.a2monthhw7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a2monthhw7.databinding.FragmentDetailsBinding

class DetailsFragment : Fragment() {

    private lateinit var binding: FragmentDetailsBinding
    private lateinit var navArgs: DetailsFragmentArgs

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        arguments?.let { 
            navArgs = DetailsFragmentArgs.fromBundle(it)
        }
        val falls = navArgs.gravityFalls
        binding.tvExecutorDetails.text = falls.executor.toString()
        binding.tvNameDetails.text = falls.name.toString()
        binding.imgDetails.loadImage(falls.picture)
        
    }



}