package com.example.camilo.sirem;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.camilo.sirem.databinding.ActivitySerie4Binding;

public class Serie4Activity extends AppCompatActivity {
    ActivitySerie4Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_serie4);
        binding.setHandler(this);

    }

    public void goToDescanso4(){
        Intent intent = new Intent(this, Descanso4Activity.class);
        startActivity(intent);

    }
}
