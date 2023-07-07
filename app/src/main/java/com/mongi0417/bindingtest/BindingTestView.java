package com.mongi0417.bindingtest;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.mongi0417.bindingtest.databinding.ViewBindingBinding;

public class BindingTestView extends AppCompatActivity implements View.OnClickListener { // 단순한 View Binding 예제
    private ViewBindingBinding viewBinding;
    private int number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewBinding = ViewBindingBinding.inflate(getLayoutInflater());
        setContentView(viewBinding.getRoot());

        loadTextView();
        setClickListener();
    }

    private void setClickListener() {
        viewBinding.btnPlus.setOnClickListener(this);
        viewBinding.btnMinus.setOnClickListener(this);
    }

    private void loadTextView() {
        viewBinding.tvNumber.setText(Integer.toString(number));
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == viewBinding.btnPlus.getId())
            number++;
        else {
            number--;
        }
        viewBinding.tvNumber.setText(Integer.toString(number));
    }
}