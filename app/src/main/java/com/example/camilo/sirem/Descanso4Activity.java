package com.example.camilo.sirem;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.camilo.sirem.databinding.ActivityDescanso4Binding;

public class Descanso4Activity extends AppCompatActivity {

    ActivityDescanso4Binding binding;
    private TextView txtCD4;
    private CountDownTimer CD4 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_descanso4);
        binding.setHandler(this);
        txtCD4 = (TextView) findViewById(R.id.txtCD4);

        CD4 =  new CountDownTimer(11000,1000){

            @Override
            public void onTick(long millisUntilFinished) {
                txtCD4.setText(""+millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
                txtCD4.setText("0");
                CD4.cancel();
                goToMain();
            }
        }.start();
    }

    public void goToMain() {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
