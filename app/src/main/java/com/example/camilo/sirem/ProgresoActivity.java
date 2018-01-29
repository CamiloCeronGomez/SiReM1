package com.example.camilo.sirem;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.example.camilo.sirem.databinding.ActivityProgresoBinding;
import com.example.camilo.sirem.fragments.ProgresoFragment;

public class ProgresoActivity extends AppCompatActivity {
    ActivityProgresoBinding binding;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_progreso);
        putFragment(R.id.containerProgreso, ProgresoFragment.instance());
        binding.setHandlerProgreso(this);

        //region Option Bottom Navigation Menu
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.btnBottom);
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.btnTratamiento:

                                Intent intent = new Intent(ProgresoActivity.this, MainActivity.class);
                                startActivity(intent);

                                break;

                            case R.id.btnProgreso:
                                Intent intent2 = new Intent(ProgresoActivity.this, ProgresoActivity.class);
                                startActivity(intent2);
                                break;

                            case R.id.btnPerfil:
                                Intent intent3 = new Intent(ProgresoActivity.this, PerfilActivity.class);
                                startActivity(intent3);
                                break;

                        }
                        return true;
                    }
                });
        //endregion

    }
    //region Option Info Menu

    public void putFragment(int containerProgreso, Fragment fragment) {

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(containerProgreso, fragment);
        ft.commit();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_info:

                Intent intent = new Intent(ProgresoActivity.this, InfoActivity.class);
                startActivity(intent);

                break;
        }
        return super.onOptionsItemSelected(item);
    }
    //endregion
}

