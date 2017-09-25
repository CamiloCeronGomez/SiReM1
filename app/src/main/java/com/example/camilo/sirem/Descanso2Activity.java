package com.example.camilo.sirem;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.example.camilo.sirem.databinding.ActivityDescanso2Binding;

public class Descanso2Activity extends AppCompatActivity {

    ActivityDescanso2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_descanso2);
        binding.setHandler(this);
        goToContador();
    }
    public void goToContador(){

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                goToSerie3();
            }
        }, 10000);
    }
    public void goToSerie3() {
        Intent intent = new Intent(this, Serie3Activity.class);
        startActivity(intent);
    }
}
