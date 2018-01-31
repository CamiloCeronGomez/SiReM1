package com.example.camilo.sirem;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.camilo.sirem.databinding.ActivityEspereBinding;

public class EspereActivity extends AppCompatActivity implements SensorEventListener{

    ActivityEspereBinding binding;

    private LinearLayout layoutEspere;
    private LinearLayout layoutPrimerInicia;
    private LinearLayout layoutPrimerAngulo;
    private TextView txtPrimerAngulo;
    private LinearLayout layoutSegundoInicia;
    private LinearLayout layoutSegundoAngulo;
    private TextView txtSegundoAngulo;

    private float Ac = 0;

    private SensorManager sensorManager;
    private Sensor acelerometro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_espere);
        binding.setHandler(this);

        layoutEspere = (LinearLayout)findViewById(R.id.layoutEspere);
        layoutPrimerInicia = (LinearLayout)findViewById(R.id.layoutPrimerInicia);
        layoutPrimerAngulo = (LinearLayout)findViewById(R.id.layoutPrimerAngulo);
        txtPrimerAngulo = (TextView) findViewById(R.id.txtPrimerAngulo);
        layoutSegundoInicia = (LinearLayout)findViewById(R.id.layoutSegundoInicia);
        layoutSegundoAngulo = (LinearLayout)findViewById(R.id.layoutSegundoAngulo);
        txtSegundoAngulo = (TextView)findViewById(R.id.txtSegundoAngulo);

        sensorManager = (SensorManager)getSystemService(Context.SENSOR_SERVICE);

        acelerometro = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        layoutEspere.setVisibility(View.VISIBLE);
        layoutPrimerInicia.setVisibility(View.INVISIBLE);
        layoutPrimerAngulo.setVisibility(View.INVISIBLE);
        layoutSegundoInicia.setVisibility(View.INVISIBLE);
        layoutSegundoAngulo.setVisibility(View.INVISIBLE);

        if (acelerometro == null)
            finish();

       primerinicia();
    }
    protected void onResume(){
        super.onResume();
        sensorManager.registerListener(this, acelerometro, SensorManager.SENSOR_DELAY_NORMAL);
    }
    protected  void onPause(){
        super.onPause();
        sensorManager.unregisterListener(this);
    }
    @Override
    public void onSensorChanged(SensorEvent event){
        Ac = event.values[0];
        txtPrimerAngulo.setText(""+ Ac);
        txtSegundoAngulo.setText(""+ Ac);
    }


    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

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

                txtPrimerAngulo.setText("50"+ Ac);

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

                txtSegundoAngulo.setText(""+ Ac);




            }
        }, 2000);

    }

    public void goToMainEvaluar() {

        Intent intent = new Intent(this, MainEvaluarActivity.class);
        startActivity(intent);
    }



}
