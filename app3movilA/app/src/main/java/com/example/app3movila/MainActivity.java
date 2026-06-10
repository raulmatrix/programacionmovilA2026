package com.example.app3movila;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView numero;  //variable global
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

        numero = findViewById(R.id.txtNumero); //relacion con la parte grafica
    }

    public void incrementar(View v){
        int valor =  Integer.parseInt(numero.getText().toString()); //obtener el valor en tipo entero de TextView
        valor++;
        numero.setText(""+valor);

        Toast.makeText(getApplicationContext(), "El valor actual es: "+valor, Toast.LENGTH_LONG).show();
    }

    public void decrementar(View v){

    }

}