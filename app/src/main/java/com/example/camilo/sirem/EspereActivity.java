package com.example.camilo.sirem;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class EspereActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espere);
        primerinicia();
    }

    private void primerinicia() {
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                setContentView(R.layout.activity_primerinicia);
                primerangulo();
            }
        }, 5000);
    }
    private void primerangulo(){
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                setContentView(R.layout.activity_primerangulo);
                segundoinicia();
            }
        }, 2000);

    }
    private void segundoinicia() {
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                setContentView(R.layout.activity_segundoinicia);
                segundoangulo();
            }
        }, 5000);
    }
    private void segundoangulo(){
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                setContentView(R.layout.activity_segundoangulo);

            }
        }, 2000);

    }
}
