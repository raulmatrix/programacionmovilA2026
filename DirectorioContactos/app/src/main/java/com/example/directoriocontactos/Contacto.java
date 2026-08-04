package com.example.directoriocontactos;

public class Contacto {

    private String nombre;
    private String apellidoPat;
    private String apellidoMat;
    private int telefono;

    public Contacto(String nombre, String apellidoPat, String apellidoMat, int telefono) {
        this.nombre = nombre;
        this.apellidoPat = apellidoPat;
        this.apellidoMat = apellidoMat;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPat() {
        return apellidoPat;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    public String getApellidoMat() {
        return apellidoMat;
    }

    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
