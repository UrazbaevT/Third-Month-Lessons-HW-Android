package com.example.a2_month_lesson2;

import static com.example.a2_month_lesson2.FirstFragment.KEY_USERNAME;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondFragment extends Fragment {

    private TextView tvResult;
    private EditText etType;
    private Button btnGo;
    final static String KEY_EDIT_TEXT = "etkey";
    final static String KEY_AGE = "age";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        initListener();
        String result = getArguments().getString(KEY_USERNAME);
        tvResult.setText(result);


    }

    private void initListener() {
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString(KEY_EDIT_TEXT, etType.getText().toString());
                bundle.putInt(KEY_AGE, 40);

                ThirdFragment fragment = new ThirdFragment();
                fragment.setArguments(bundle);

                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, fragment).addToBackStack(null).commit();
            }
        });
    }

    private void initView() {
        tvResult = requireActivity().findViewById(R.id.tv_result);
        etType = requireActivity().findViewById(R.id.et_type);
        btnGo = requireActivity().findViewById(R.id.btn_go);
    }
}