package com.example.directoriocontactos;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listaContactos;
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

        //listview
        listaContactos = findViewById(R.id.lvContactos);

        //datos
        ArrayList<Contacto> lista = new ArrayList<Contacto>();
        lista.add(new Contacto("Jose","Perez", "Gonzales",74856215));
        lista.add(new Contacto("Ana","Torrez", "Gonzales",74512896));
        lista.add(new Contacto("Emma","Ampuero", "Gonzales",77956321));
        lista.add(new Contacto("Iris","Mercado", "Gonzales",77125638));
        lista.add(new Contacto("Antonio","Rojas", "Gonzales",77654896));

        //adaptador
        ContactoAdapter adapter = new ContactoAdapter(lista);

        //mostrar

        listaContactos.setAdapter(adapter);

    }
}