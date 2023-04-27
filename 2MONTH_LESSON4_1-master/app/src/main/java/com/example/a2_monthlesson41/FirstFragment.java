package com.example.a2_monthlesson41;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a2_monthlesson41.databinding.FragmentFirstBinding;

import java.util.ArrayList;

public class FirstFragment extends Fragment implements OnItemClick{

    private FragmentFirstBinding binding;
    private ArrayList<Country> countryList = new ArrayList<>();
    private CountryAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new CountryAdapter(countryList, this);
        binding.recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        countryList.add(new Country("Kyrgyzstan", "Bishkek", "https://seekflag.com/app/uploads/2021/12/Flag-of-kyrgyzstan-01.png"));
        countryList.add(new Country("Belgium", "Brussels", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/92/Flag_of_Belgium_%28civil%29.svg/255px-Flag_of_Belgium_%28civil%29.svg.png"));
        countryList.add(new Country("USA", "Washington", "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/1200px-Flag_of_the_United_States.svg.png"));
        countryList.add(new Country("Nigeria", "Abuja", "https://cdn.britannica.com/68/5068-004-72A3F250/Flag-Nigeria.jpg"));
        countryList.add(new Country("Russia", "Moscow", "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/640px-Flag_of_Russia.svg.png"));
        countryList.add(new Country("Great Britain", "London", "https://upload.wikimedia.org/wikipedia/en/thumb/a/ae/Flag_of_the_United_Kingdom.svg/640px-Flag_of_the_United_Kingdom.svg.png"));
        countryList.add(new Country("Australia", "Canberra", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b9/Flag_of_Australia.svg/2560px-Flag_of_Australia.svg.png"));
        countryList.add(new Country("Brasilia", "Brasilia","https://upload.wikimedia.org/wikipedia/en/thumb/0/05/Flag_of_Brazil.svg/1200px-Flag_of_Brazil.svg.png"));
        countryList.add(new Country("Estonia", "Tallinn", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8f/Flag_of_Estonia.svg/2560px-Flag_of_Estonia.svg.png"));
        countryList.add(new Country("Spain", "Madrid", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/89/Bandera_de_Espa%C3%B1a.svg/1200px-Bandera_de_Espa%C3%B1a.svg.png"));
        countryList.add(new Country("Qatar", "Doha", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Flag_of_Qatar_%283-2%29.svg/1024px-Flag_of_Qatar_%283-2%29.svg.png"));
        countryList.add(new Country("Lithuania", "Vilnius", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/Flag_of_Lithuania.svg/640px-Flag_of_Lithuania.svg.png"));
        countryList.add(new Country("Korea", "Seoul", "https://cdn.britannica.com/49/1949-004-8818300C/Flag-South-Korea.jpg"));
        countryList.add(new Country("Germany", "Berlin", "https://upload.wikimedia.org/wikipedia/en/thumb/b/ba/Flag_of_Germany.svg/1200px-Flag_of_Germany.svg.png"));
    }

    @Override
    public void onClick(int position) {
        Country country = countryList.get(position);
        Bundle bundle = new Bundle();
        bundle.putSerializable("country", country);
        Fragment fragment = new DetailCountryFragment();
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).addToBackStack(null).commit();

    }
}