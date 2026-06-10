package com.example.appheroe;

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
    //EditText tipo;
    Spinner tipo;

    EditText nivel;

    ArrayList <Heroe> listaHeroes;
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

        listaHeroes = new ArrayList<Heroe>();

        nombre = findViewById(R.id.etNombre);
        tipo = findViewById(R.id.spTipo);
        nivel = findViewById(R.id.etNivel);
    }

    /*public void registrar(View v){
        //obtener los valores de los inputs
        String nombreObt = nombre.getText().toString();
        String tipoObt = tipo.getSelectedItem().toString();//obtener valor del spinner
        //String tipoObt = tipo.getText().toString();
        int nivelObt = Integer.parseInt(nivel.getText().toString());

        Heroe heroe = new Heroe(nombreObt,tipoObt,nivelObt); //creamos el objeto

        Intent it = new Intent(getApplicationContext(), HeroesRegistro.class);
        it.putExtra("ObjetoHeroe",heroe);
        startActivity(it);
    }*/

    public void registrar(View v){
        String nombreObt = nombre.getText().toString();
        String tipoObt = tipo.getSelectedItem().toString();//obtener valor del spinner
        int nivelObt = Integer.parseInt(nivel.getText().toString());

        Heroe heroe = new Heroe(nombreObt,tipoObt,nivelObt); //creamos el objeto

        listaHeroes.add(heroe);
    }

    public void mostrarRegistros(View v){
        Intent it = new Intent(getApplicationContext(), ListaHeroes.class);
        it.putExtra("listaHeroesLlave",listaHeroes);
        startActivity(it);
    }
}