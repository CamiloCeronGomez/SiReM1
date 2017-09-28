package com.example.camilo.sirem;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.camilo.sirem.databinding.ActivityDescanso1Binding;

public class Descanso1Activity extends AppCompatActivity {

    ActivityDescanso1Binding binding;
    private TextView txtCD1;
    private CountDownTimer CD1 = null ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_descanso1);
        binding.setHandler(this);
        txtCD1 = (TextView) findViewById(R.id.txtCD1);

        CD1 =  new CountDownTimer(11000,1000){

            @Override
            public void onTick(long millisUntilFinished) {
            txtCD1.setText(""+millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
                txtCD1.setText("0");
                CD1.cancel();
                goToSerie2();
            }
        }.start();

    }


    public void goToSerie2() {

        Intent intent = new Intent(this, Serie2Activity.class);
        startActivity(intent);
    }
}
