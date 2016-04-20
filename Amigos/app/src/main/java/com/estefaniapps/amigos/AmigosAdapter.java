package com.estefaniapps.amigos;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AmigosAdapter extends ArrayAdapter<Amigo> {
    private ArrayList<Amigo> amigos;

    public AmigosAdapter(Context context, int textViewResourceId, ArrayList amigos) {
        super(context, textViewResourceId, amigos);
        this.amigos = amigos;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View rootView = convertView;

        final Amigo amigo = amigos.get(position);
        if (rootView == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rootView = inflater.inflate(R.layout.list_item_amigos, null);
        }



        // En esta parte se hará el async
        if (amigo != null) {

            TextView nombre = (TextView) rootView.findViewById(R.id.amigo_nombre);
            ImageView foto = (ImageView) rootView.findViewById(R.id.amigo_foto);
            nombre.setText(amigo.getNombre());

            if(amigo.getRoundedFoto() == null){
                ImageInfo info = new ImageInfo(amigo, foto);
                new DownloadImagesTask().execute(info);
            }
            else{
                foto.setImageDrawable(amigo.getRoundedFoto());
            }

        }
        return rootView;
    }

}