package com.estefaniapps.amigos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class Amigos extends android.app.Fragment {

    private ArrayList<Amigo> amigos = new ArrayList<>();
    private AmigosAdapter a_adapter;
    private View rootView;
    private RelativeLayout loadingPanel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ((MainActivity) getActivity()).setListener(this);
        loadingPanel = (RelativeLayout) rootView.findViewById(R.id.loadingPanel);
        return rootView;
    }

    public void populateListView(ArrayList<Amigo> arrayList){
        this.amigos = arrayList;
        a_adapter = new AmigosAdapter(getActivity(), R.layout.list_item_amigos, amigos);
        ListView lv = (ListView) rootView.findViewById(R.id.listView_amigos);
        lv.setAdapter(a_adapter);

        loadingPanel.setVisibility(View.GONE);

        lv.setOnTouchListener(new View.OnTouchListener() {
            // Setting on Touch Listener for handling the touch inside ScrollView
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // Disallow the touch request for parent scroll on touch of child view
                v.getParent().requestDisallowInterceptTouchEvent(true);
                return false;
            }
        });
    }

    public RelativeLayout getLoadingPanel(){
        return loadingPanel;
    }

}