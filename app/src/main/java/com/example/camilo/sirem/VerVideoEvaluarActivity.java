package com.example.camilo.sirem;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;

import com.example.camilo.sirem.databinding.ActivityVervideoevaluarBinding;
import com.example.camilo.sirem.models.Evaluar;
import com.example.camilo.sirem.util.DataEvaluar;

public class VerVideoEvaluarActivity extends AppCompatActivity {

    ActivityVervideoevaluarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_vervideoevaluar);
        binding.setHandler(this);

        int pos = getIntent().getExtras().getInt("pos");
        Evaluar evaluar = DataEvaluar.getEvaluaciones().get(pos);
        binding.setVideo(evaluar);
        binding.videoEv.setMediaController(new MediaController(this));
    }
    public void goToEspere(){
        Intent intent = new Intent(this, EspereActivity.class);
        startActivity(intent);
    }
}
