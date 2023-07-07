package com.mongi0417.bindingtest;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel { // View Model + Data Binding + Live Data
    private MutableLiveData<Integer> count = new MutableLiveData<>();

    public MainViewModel() {
        count.setValue(0);
    }

    public MutableLiveData<Integer> getCount() {
        return count;
    }

    public void increaseCount() {
        count.setValue(count.getValue() + 1);
    }

    public void decreaseCount() {
        count.setValue(count.getValue() - 1);
    }
}
