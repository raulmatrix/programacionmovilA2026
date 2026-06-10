package com.example.app4movila;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText nombre;
    EditText nacimiento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        nombre = findViewById(R.id.etNombre);
        nacimiento = findViewById(R.id.etNacimiento);
    }

    public void enviar(View v){
        String nombreEnvio = nombre.getText().toString();
        int nacimientoValor = Integer.parseInt(nacimiento.getText().toString());
        Intent it = new Intent(getApplicationContext(), ActivityDatos.class);
        //paso de datos
        it.putExtra("llave", nombreEnvio);
        it.putExtra("llave2", nacimientoValor);
        startActivity(it);
    }
}