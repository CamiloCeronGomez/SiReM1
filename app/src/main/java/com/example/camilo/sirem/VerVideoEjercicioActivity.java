package com.example.camilo.sirem;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;

import com.example.camilo.sirem.databinding.ActivityVervideoejercicioBinding;
import com.example.camilo.sirem.models.Ejercicio;
import com.example.camilo.sirem.util.Data;


public class VerVideoEjercicioActivity extends AppCompatActivity {

    ActivityVervideoejercicioBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_vervideoejercicio);

        int pos = getIntent().getExtras().getInt("pos");
        Ejercicio ejercicio = Data.getEjercicios().get(pos);
        binding.setVideo(ejercicio);
        binding.videoP.setMediaController(new MediaController(this));

        
    }
}
