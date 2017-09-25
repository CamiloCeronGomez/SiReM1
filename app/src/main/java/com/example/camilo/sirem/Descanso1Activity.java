package com.example.camilo.sirem;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.camilo.sirem.databinding.ActivityDescanso1Binding;

public class Descanso1Activity extends AppCompatActivity {
    ActivityDescanso1Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding = DataBindingUtil.setContentView(this, R.layout.activity_descanso1);
        binding.setHandler(this);
        goToContador();
    }
    public void goToContador(){

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                goToSerie2();
            }
        }, 10000);
    }
    public void goToSerie2() {
        Intent intent = new Intent(this, Serie2Activity.class);
        startActivity(intent);
    }
}
