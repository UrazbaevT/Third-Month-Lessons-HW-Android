package com.example.a2month_hw2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FirstFragment extends Fragment {

    TextView textView;
    Button buttonMinus;
    Button buttonPlus;
    int click;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        findID();
        buttonsClicks();
    }


    void findID() {
        textView = requireActivity().findViewById(R.id.tw_1);
        buttonPlus = requireActivity().findViewById(R.id.btn_plus);
        buttonMinus = requireActivity().findViewById(R.id.btn_minus);
    }


    void buttonsClicks() {
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(toString().valueOf(click));
                click++;
            }
        });


        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(toString().valueOf(click));
                click--;
            }
        });
    }
}
