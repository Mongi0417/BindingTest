package com.mongi0417.bindingtest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.mongi0417.bindingtest.databinding.DataBindingBinding;

public class BindingTestData extends AppCompatActivity {
    private DataBindingBinding dataBindingBinding;
    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dataBindingBinding = DataBindingUtil.setContentView(this, R.layout.data_binding);

        // Data Binding 객체가 해당 액티비티의 LifeCycle을 참조한다.
        // MutableLiveData 사용 시 필요.
        dataBindingBinding.setLifecycleOwner(this);

        // ViewModel 가져오기
        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        dataBindingBinding.setViewmodel(mainViewModel);
    }
}
