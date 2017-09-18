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

import com.example.camilo.sirem.databinding.ActivityMainBinding;
import com.example.camilo.sirem.fragments.MainFragment;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        putFragment(R.id.container, MainFragment.instance());
        binding.setHandlerMain(this);
        //region Option Bottom Navigation Menu
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.btnBottom);
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.btnTratamiento:

                                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                                startActivity(intent);

                                break;

                            case R.id.btnProgreso:
                                Intent intent2 = new Intent(MainActivity.this, ProgresoActivity.class);
                                startActivity(intent2);
                                break;

                            case R.id.btnPerfil:
                                Intent intent3 = new Intent(MainActivity.this, PerfilActivity.class);
                                startActivity(intent3);
                                break;

                        }
                        return true;
                    }
                });
        //endregion

    }

    public void putFragment(int container, Fragment fragment) {

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(container, fragment);
        ft.commit();
    }

    //region Option Info Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_info:

                Intent intent = new Intent(MainActivity.this, InfoActivity.class);
                startActivity(intent);

                break;
        }
        return super.onOptionsItemSelected(item);
    }
    //endregion
}
