package com.example.camilo.sirem;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.camilo.sirem.databinding.ActivitySerie1Binding;

public class Serie1Activity extends AppCompatActivity {
    ActivitySerie1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_serie1);
        binding.setHandler(this);
    }
    public void goToDescanso1() {
        Intent intent = new Intent(this, Descanso1Activity.class);
        startActivity(intent);
    }
    }