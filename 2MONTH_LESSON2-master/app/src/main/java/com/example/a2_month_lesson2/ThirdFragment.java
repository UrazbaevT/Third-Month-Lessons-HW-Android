package com.example.a2_month_lesson2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.SplittableRandom;

public class ThirdFragment extends Fragment {

    private TextView tvResult3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();

        String result_et = getArguments().getString(SecondFragment. KEY_EDIT_TEXT);
        Integer result_age = getArguments().getInt(SecondFragment.KEY_AGE);

        //tvResult3.setText(result_age.toString());
        tvResult3.setText(result_age);
    }

    private void initView() {
        tvResult3 = requireActivity().findViewById(R.id.tv_result3);

    }
}