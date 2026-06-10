package com.example.appmundial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText nombre;
    Spinner grupo;
    Spinner continente;

    ArrayList <Equipo>listaEquipos;

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
        grupo = findViewById(R.id.spGrupos);
        continente = findViewById(R.id.spContinentes);

        listaEquipos = new ArrayList<Equipo>();
    }

    public void registrar(View v){
        String nombreObt = nombre.getText().toString();
        String grupoObt = grupo.getSelectedItem().toString();
        String continenteObt = continente.getSelectedItem().toString();

        Equipo equipo = new Equipo(nombreObt,grupoObt,continenteObt);
        listaEquipos.add(equipo);

    }

    public void enviarEquipos(View v){
        Intent it = new Intent(getApplicationContext(), EquiposRegistrados.class);
        it.putExtra("listaEquipos",listaEquipos);
        startActivity(it);
    }
}