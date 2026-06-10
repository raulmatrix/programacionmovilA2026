package com.example.appheroe;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HeroesRegistro extends AppCompatActivity {

    TextView nombre, tipo, nivel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_heroes_registro);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        nombre = findViewById(R.id.txtnombre);
        tipo = findViewById(R.id.txttipo);
        nivel = findViewById(R.id.txtnivel);

        Heroe heroe = (Heroe) getIntent().getSerializableExtra("ObjetoHeroe");
        nombre.setText(heroe.getNombre());
        tipo.setText(heroe.getTipo());
        nivel.setText(""+heroe.getNivel());
    }
}