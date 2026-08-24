package com.example.listapaises;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterPais extends RecyclerView.Adapter<AdapterPais.viewHolder> {
p

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    //clase interna viewholder
    public class viewHolder extends RecyclerView.ViewHolder{
        TextView pais,continente,habitantes,capital;
        ImageView bandera;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            pais = itemView.findViewById(R.id.txtNombrePais);
            continente = itemView.findViewById(R.id.txtContinente);
            habitantes = itemView.findViewById(R.id.txtHabitantes);
            capital = itemView.findViewById(R.id.txtCapital);
            bandera = itemView.findViewById(R.id.imgBandera);
        }
    }
}
