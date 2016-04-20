package com.estefaniapps.amigos;

import android.support.v4.graphics.drawable.RoundedBitmapDrawable;

public class Amigo {
    private String nombre;
    private String foto;
    private RoundedBitmapDrawable roundedFoto;

    public Amigo(String nombre, String foto) {
        this.nombre = nombre;
        this.foto = foto;
        this.roundedFoto = null;
    }

    public String getNombre(){
        return nombre;
    }

    public String getFoto() {
        return foto;
    }

    public void setRoundedFoto(RoundedBitmapDrawable bitmap){
        this.roundedFoto = bitmap;
    }

    public RoundedBitmapDrawable getRoundedFoto(){
       return roundedFoto;
    }
}

