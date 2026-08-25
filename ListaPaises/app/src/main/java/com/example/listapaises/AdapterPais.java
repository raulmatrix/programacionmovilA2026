package com.example.listapaises;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterPais extends RecyclerView.Adapter<AdapterPais.viewHolder> {

    ArrayList<Pais> listaPaises;

    public AdapterPais(ArrayList<Pais> listaPaises) {
        this.listaPaises = listaPaises;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_pais, parent, false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.pais.setText(listaPaises.get(position).getNombre());
        holder.capital.setText(listaPaises.get(position).getCapital());
        holder.continente.setText(listaPaises.get(position).getContinente());
        holder.habitantes.setText(listaPaises.get(position).getHabitantes());
        holder.bandera.setImageResource(listaPaises.get(position).getBandera());
    }

    @Override
    public int getItemCount() {

        return listaPaises.size();
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
