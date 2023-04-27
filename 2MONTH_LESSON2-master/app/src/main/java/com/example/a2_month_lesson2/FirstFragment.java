package com.example.a2_month_lesson2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FirstFragment extends Fragment {

    final static String KEY_USERNAME = "username";
    private Button btnNext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        clickListener();
    }



    private void initView() {
        btnNext = requireActivity().findViewById(R.id.btn_next);
    }


    private void clickListener() {
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextFragment();
            }
        });
    }


    private void nextFragment() {
        Bundle bundle = new Bundle();
        bundle.putString(KEY_USERNAME, "alina003");
        SecondFragment fragment = new SecondFragment();
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction()
                .addToBackStack(null).replace(R.id.container, fragment).commit();
    }
}