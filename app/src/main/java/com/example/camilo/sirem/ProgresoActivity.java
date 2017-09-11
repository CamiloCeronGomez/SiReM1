package com.example.camilo.sirem;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class ProgresoActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progreso);

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

