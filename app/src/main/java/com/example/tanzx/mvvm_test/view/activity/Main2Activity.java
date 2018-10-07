package com.example.tanzx.mvvm_test.view.activity;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.tanzx.mvvm_test.R;
import com.example.tanzx.mvvm_test.databinding.ActivityMain2Binding;
import com.example.tanzx.mvvm_test.viewmodel.MainViewModel;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MainViewModel mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);

        ActivityMain2Binding activityMain2Binding = DataBindingUtil.setContentView(this, R.layout.activity_main2);
        activityMain2Binding.setLifecycleOwner(this);
        activityMain2Binding.setMainVM(mainViewModel);

    }

}
