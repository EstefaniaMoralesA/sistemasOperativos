package com.estefaniapps.amigos;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class Amigos extends android.app.Fragment {

    private ArrayList<Amigo> amigos = new ArrayList<>();
    private AmigosAdapter a_adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Log.e("amigos: ", "Amigos 1");


        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        amigos.clear();
        amigos.add(new Amigo("Juan Lopez", "http://pickaface.net/avatar/pickaface51f38ca9987be.png"));
        amigos.add(new Amigo("Pedro Sanchez", "http://www.exclutips.com/wp-content/uploads/2015/08/wordpress-custom-user-avatar.png"));
        amigos.add(new Amigo("Estefania Morales", "http://www.exclutips.com/wp-content/uploads/2015/08/wordpress-custom-user-avatar.png"));
        amigos.add(new Amigo("Juan Lopez", "http://pickaface.net/avatar/pickaface51f38ca9987be.png"));
        amigos.add(new Amigo("Pedro Sanchez", "http://www.exclutips.com/wp-content/uploads/2015/08/wordpress-custom-user-avatar.png"));
        amigos.add(new Amigo("Estefania Morales", "http://www.exclutips.com/wp-content/uploads/2015/08/wordpress-custom-user-avatar.png"));
        amigos.add(new Amigo("Juan Lopez", "http://pickaface.net/avatar/pickaface51f38ca9987be.png"));
        amigos.add(new Amigo("Pedro Sanchez", "http://www.exclutips.com/wp-content/uploads/2015/08/wordpress-custom-user-avatar.png"));
        amigos.add(new Amigo("Estefania Morales", "http://www.exclutips.com/wp-content/uploads/2015/08/wordpress-custom-user-avatar.png"));
        amigos.add(new Amigo("Juan Lopez", "http://pickaface.net/avatar/pickaface51f38ca9987be.png"));
        amigos.add(new Amigo("Pedro Sanchez", "http://www.exclutips.com/wp-content/uploads/2015/08/wordpress-custom-user-avatar.png"));
        amigos.add(new Amigo("Estefania Morales", "http://www.exclutips.com/wp-content/uploads/2015/08/wordpress-custom-user-avatar.png"));


        a_adapter = new AmigosAdapter(getActivity(), R.layout.list_item_amigos, amigos);
        ListView lv = (ListView) rootView.findViewById(R.id.listView_amigos);
        lv.setAdapter(a_adapter);


        lv.setOnTouchListener(new View.OnTouchListener() {
            // Setting on Touch Listener for handling the touch inside ScrollView
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // Disallow the touch request for parent scroll on touch of child view
                v.getParent().requestDisallowInterceptTouchEvent(true);
                return false;
            }
        });

        Log.e("amigos: ", "Amigos 2");

        return rootView;
    }

}