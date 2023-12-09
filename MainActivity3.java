package com.example.calendario;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;


public class MainActivity3 extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

    }

    public void cambio1(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        // Toast.makeText(this, "Ejecutando", Toast.LENGTH_SHORT.show());
        startActivity(intent);
    }

    public void cambio2(View view) {
        Intent intent = new Intent(this, EventListActivity.class);
        // Toast.makeText(this, "Ejecutando", Toast.LENGTH_SHORT.show());
        startActivity(intent);
    }

    Button addEventButton = findViewById(R.id.addEventButton);
    {
        addEventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // ... (código anterior)

                // Pasa la lista de eventos a la nueva actividad
                Intent intent = new Intent(MainActivity3.this, EventListActivity.class);
                startActivity(intent);
            }
        });
    }
}

