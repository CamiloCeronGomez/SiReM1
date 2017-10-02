package com.example.camilo.sirem;

import android.databinding.DataBindingUtil;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.camilo.sirem.databinding.ActivityMainevaluarBinding;
import com.example.camilo.sirem.fragments.MainEvaluarFragment;

public class MainEvaluarActivity extends AppCompatActivity {

    ActivityMainevaluarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_mainevaluar);
        putFragment(R.id.containerEv, MainEvaluarFragment.instance());
        binding.setHanler(this);
    }

    private void putFragment(int containerEv, Fragment fragment) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(containerEv, fragment);
        ft.commit();
    }
}
