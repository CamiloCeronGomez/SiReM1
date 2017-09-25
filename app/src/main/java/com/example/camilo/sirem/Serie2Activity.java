package com.example.camilo.sirem;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.camilo.sirem.databinding.ActivitySerie2Binding;

public class Serie2Activity extends AppCompatActivity {
    ActivitySerie2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_serie2);
        binding.setHandler(this);

    }

    public void goToDescanso2(){
        Intent intent = new Intent(this, Descanso2Activity.class);
        startActivity(intent);

    }
}
