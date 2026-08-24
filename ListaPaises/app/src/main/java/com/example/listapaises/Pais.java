package com.example.listapaises;

public class Pais {

    private String nombre;
    private String capital;
    private String habitantes;
    private int bandera;
    private String continente;

    public Pais(int bandera, String capital, String continente, String habitantes, String nombre) {
        this.bandera = bandera;
        this.capital = capital;
        this.continente = continente;
        this.habitantes = habitantes;
        this.nombre = nombre;
    }

    public int getBandera() {
        return bandera;
    }

    public void setBandera(int bandera) {
        this.bandera = bandera;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(String habitantes) {
        this.habitantes = habitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
