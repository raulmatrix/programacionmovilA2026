package com.example.appheroe;

import java.io.Serializable;

public class Heroe implements Serializable {

    //atributos
    private String nombre;
    private String tipo;
    private int nivel; //1-10

    public Heroe(String nombre, String tipo, int nivel) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
