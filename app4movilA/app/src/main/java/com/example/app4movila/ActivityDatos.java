package com.example.app4movila;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityDatos extends AppCompatActivity {

    TextView nombreObtenido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_datos);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        nombreObtenido = findViewById(R.id.txtnombreObt);

        //obtener los datos del intent enviado
        String nombreRecepcion = getIntent().getStringExtra("llave");
        int valorNac = getIntent().getIntExtra("llave2",0);
        int edad = 2026 - valorNac;
        //actualizar el textview
        nombreObtenido.setText("El estudiante "+nombreRecepcion+" tiene "+edad+" años");
    }
}