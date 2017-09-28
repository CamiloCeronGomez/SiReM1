package com.example.camilo.sirem;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.camilo.sirem.databinding.ActivityDescanso3Binding;

public class Descanso3Activity extends AppCompatActivity {

    ActivityDescanso3Binding binding;
    private TextView txtCD3;
    private CountDownTimer CD3 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_descanso3);
        binding.setHandler(this);
        txtCD3 = (TextView) findViewById(R.id.txtCD3);

        CD3 =  new CountDownTimer(11000,1000){

            @Override
            public void onTick(long millisUntilFinished) {
                txtCD3.setText(""+millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
                txtCD3.setText("0");
                CD3.cancel();
                goToSerie4();
            }
        }.start();
    }

    public void goToSerie4() {

        Intent intent = new Intent(this, Serie4Activity.class);
        startActivity(intent);
    }
}
