package com.example.directoriocontactos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ContactoAdapter extends BaseAdapter {

    private ArrayList<Contacto> listaContactos;
    //metodo constructor
    public ContactoAdapter(ArrayList<Contacto> listaContactos){
        this.listaContactos = listaContactos;
    }

    @Override
    public int getCount() {
        return listaContactos.size();
    }

    @Override
    public Object getItem(int i) {
        return listaContactos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.item_contacto, viewGroup, false);

            Contacto contacto = listaContactos.get(i);
            TextView tvNombreCompleto = view.findViewById(R.id.txt_nombreApellido);
            TextView tvTelefono = view.findViewById(R.id.txtNumero);
            TextView tvInicial = view.findViewById(R.id.txt_inicialContacto);

            tvNombreCompleto.setText(contacto.getNombre()+" "+contacto.getApellidoPat()+" "+contacto.getApellidoMat());
            tvTelefono.setText(String.valueOf(contacto.getTelefono()));

            tvInicial.setText(contacto.getNombre().substring(0,1).toUpperCase());

        }

        return view;
    }
}
