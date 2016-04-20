package com.estefaniapps.amigos;

public class Amigo {
    private String nombre;
    private String foto;

    public Amigo(String nombre, String foto) {
        this.nombre = nombre;
        this.foto = foto;
    }

    public String getNombre(){
        return nombre;
    }

    public String getFoto() {
        return foto;
    }
}

