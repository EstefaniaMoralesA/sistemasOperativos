package com.estefaniapps.amigos;

import android.widget.ImageView;

/**
 * Created by Estefania on 19/04/16.
 */
public class ImageInfo {

    private String url;
    private ImageView view;

    public ImageInfo(String url, ImageView view){
        this.url = url;
        this.view = view;
    }

    public ImageView getImageView(){
        return view;
    }

    public String getUrl() {
        return url;
    }
}
