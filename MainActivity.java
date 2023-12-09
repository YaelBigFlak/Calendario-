package com.example.calendario;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final int SPLASH_DURATION = 3000; // Duración en milisegundos (3 segundos)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Crea un Intent para iniciar la actividad principal
                Intent mainIntent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(mainIntent);

                // Cierra la actividad actual para que no se pueda volver atrás
                finish();
            }
        }, SPLASH_DURATION);
    }
}