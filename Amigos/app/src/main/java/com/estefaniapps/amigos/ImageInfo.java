package com.estefaniapps.amigos;

import android.widget.ImageView;

/**
 * Created by Estefania on 19/04/16.
 */
public class ImageInfo {

    private Amigo amigo;
    private ImageView view;

    public ImageInfo(Amigo amigo, ImageView view){
        this.amigo = amigo;
        this.view = view;
    }

    public ImageView getImageView(){
        return view;
    }

    public Amigo getAmigo() {
        return amigo;
    }
}
