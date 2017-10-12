package com.example.camilo.sirem;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.example.camilo.sirem.databinding.ActivityEspereBinding;

public class EspereActivity extends AppCompatActivity {

    ActivityEspereBinding binding;

    private LinearLayout layoutEspere;
    private LinearLayout layoutPrimerInicia;
    private LinearLayout layoutPrimerAngulo;
    private LinearLayout layoutSegundoInicia;
    private LinearLayout layoutSegundoAngulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_espere);
        binding.setHandler(this);
        layoutEspere = (LinearLayout)findViewById(R.id.layoutEspere);
        layoutPrimerInicia = (LinearLayout)findViewById(R.id.layoutPrimerInicia);
        layoutPrimerAngulo = (LinearLayout)findViewById(R.id.layoutPrimerAngulo);
        layoutSegundoInicia = (LinearLayout)findViewById(R.id.layoutSegundoInicia);
        layoutSegundoAngulo = (LinearLayout)findViewById(R.id.layoutSegundoAngulo);

        layoutEspere.setVisibility(View.VISIBLE);
        layoutPrimerInicia.setVisibility(View.INVISIBLE);
        layoutPrimerAngulo.setVisibility(View.INVISIBLE);
        layoutSegundoInicia.setVisibility(View.INVISIBLE);
        layoutSegundoAngulo.setVisibility(View.INVISIBLE);

        primerinicia();
    }

    private void primerinicia() {
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                layoutEspere.setVisibility(View.INVISIBLE);
                layoutPrimerInicia.setVisibility(View.VISIBLE);
                layoutPrimerAngulo.setVisibility(View.INVISIBLE);
                layoutSegundoInicia.setVisibility(View.INVISIBLE);
                layoutSegundoAngulo.setVisibility(View.INVISIBLE);


                primerangulo();
            }
        }, 5000);
    }
    private void primerangulo(){
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                layoutEspere.setVisibility(View.INVISIBLE);
                layoutPrimerInicia.setVisibility(View.INVISIBLE);
                layoutPrimerAngulo.setVisibility(View.VISIBLE);
                layoutSegundoInicia.setVisibility(View.INVISIBLE);
                layoutSegundoAngulo.setVisibility(View.INVISIBLE);

                segundoinicia();
            }
        }, 2000);

    }
    private void segundoinicia() {
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                layoutEspere.setVisibility(View.INVISIBLE);
                layoutPrimerInicia.setVisibility(View.INVISIBLE);
                layoutPrimerAngulo.setVisibility(View.INVISIBLE);
                layoutSegundoInicia.setVisibility(View.VISIBLE);
                layoutSegundoAngulo.setVisibility(View.INVISIBLE);

                segundoangulo();
            }
        }, 5000);
    }
    private void segundoangulo(){
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                layoutEspere.setVisibility(View.INVISIBLE);
                layoutPrimerInicia.setVisibility(View.INVISIBLE);
                layoutPrimerAngulo.setVisibility(View.INVISIBLE);
                layoutSegundoInicia.setVisibility(View.INVISIBLE);
                layoutSegundoAngulo.setVisibility(View.VISIBLE);


            }
        }, 2000);

    }

    public void goToMainEvaluar() {

        Intent intent = new Intent(this, MainEvaluarActivity.class);
        startActivity(intent);
    }



}
