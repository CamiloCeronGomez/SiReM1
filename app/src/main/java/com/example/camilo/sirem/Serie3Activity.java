package com.example.camilo.sirem;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.camilo.sirem.databinding.ActivitySerie3Binding;

public class Serie3Activity extends AppCompatActivity {

    ActivitySerie3Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_serie3);
        binding.setHandler(this);

    }

    public void goToDescanso3(){
        Intent intent = new Intent(this, Descanso3Activity.class);
        startActivity(intent);

    }
}
