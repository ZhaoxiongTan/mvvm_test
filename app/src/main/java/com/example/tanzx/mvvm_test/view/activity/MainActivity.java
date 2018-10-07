package com.example.tanzx.mvvm_test.view.activity;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.tanzx.mvvm_test.R;
import com.example.tanzx.mvvm_test.databinding.ActivityMainBinding;
import com.example.tanzx.mvvm_test.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {

    private MainViewModel mainViewModel;

    private int clickTimes = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);

        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setLifecycleOwner(this);
        activityMainBinding.setMainVM(mainViewModel);
    }

    public void buttonClick(View view) {
        clickTimes += 1;
        mainViewModel.getKey1().postValue(String.valueOf(clickTimes));
    }

    public void gotoMain2(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
