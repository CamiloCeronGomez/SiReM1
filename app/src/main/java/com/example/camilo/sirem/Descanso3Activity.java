package com.example.camilo.sirem;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.example.camilo.sirem.databinding.ActivityDescanso3Binding;

public class Descanso3Activity extends AppCompatActivity {

    ActivityDescanso3Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_descanso3);
        binding.setHandler(this);
        goToContador();
    }
    public void goToContador(){

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                goToSerie4();
            }
        }, 10000);
    }
    public void goToSerie4() {
        Intent intent = new Intent(this, Serie4Activity.class);
        startActivity(intent);
    }
}
