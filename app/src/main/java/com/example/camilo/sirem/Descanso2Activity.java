package com.example.camilo.sirem;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.camilo.sirem.databinding.ActivityDescanso2Binding;

public class Descanso2Activity extends AppCompatActivity {

    ActivityDescanso2Binding binding;
    private TextView txtCD2;
    private CountDownTimer CD2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_descanso2);
        binding.setHandler(this);
        txtCD2 = (TextView) findViewById(R.id.txtCD2);

        CD2 =  new CountDownTimer(11000,1000){

            @Override
            public void onTick(long millisUntilFinished) {
                txtCD2.setText(""+millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
                txtCD2.setText("0");
                CD2.cancel();
                goToSerie3();
            }
        }.start();
    }

    public void goToSerie3() {

        Intent intent = new Intent(this, Serie3Activity.class);
        startActivity(intent);
    }
}
