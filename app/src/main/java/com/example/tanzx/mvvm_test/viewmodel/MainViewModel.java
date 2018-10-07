package com.example.tanzx.mvvm_test.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private MutableLiveData<String> key1;

    public MutableLiveData<String> getKey1() {
        if(key1 == null) {
            key1 = new MutableLiveData<>();
            key1.postValue("init value");
        }
        return key1;
    }
}
