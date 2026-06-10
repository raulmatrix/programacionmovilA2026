package com.example.appmundial;

import java.io.Serializable;

public class Equipo implements Serializable {

    private String nombre;
    private String grupo;
    private String continente;

    public Equipo(String nombre, String grupo, String continente) {
        this.nombre = nombre;
        this.grupo = grupo;
        this.continente = continente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }
}
