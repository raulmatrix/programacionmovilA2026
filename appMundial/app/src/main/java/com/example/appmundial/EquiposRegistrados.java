package com.example.appmundial;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class EquiposRegistrados extends AppCompatActivity {

    ArrayList <Equipo> listaGrupos;
    TextView grupos;

    String grupoA,grupoB,grupoC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_equipos_registrados);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        grupoA = "GRUPO A";

        grupos = findViewById(R.id.txtGrupos);
        listaGrupos = (ArrayList<Equipo>) getIntent().getSerializableExtra("listaEquipos");

        if(!listaGrupos.isEmpty()){
            for(int i=0; i<listaGrupos.size();i++){
                String grupoObt = listaGrupos.get(i).getGrupo();
                if(grupoObt=="A"){
                    grupoA = listaGrupos.get(i).getNombre()+"-";
                }
            }
        }else{

        }

    }
}