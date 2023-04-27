package com.example.a2_monthlesson41;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.a2_monthlesson41.databinding.FragmentDetailCountryBinding;

public class DetailCountryFragment extends Fragment {

    private FragmentDetailCountryBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDetailCountryBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (getArguments() != null){
            Country country = (Country) getArguments().getSerializable("country");
            binding.tvName.setText(country.getName());
            binding.tvCapital.setText(country.getCapital());
            Glide.with(binding.ivFlag).load(country.getFlag()).into(binding.ivFlag);
        }

    }
}