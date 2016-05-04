package com.estefaniapps.amigos;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    private ImageButton recibir_nuevos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recibir_nuevos = (ImageButton) findViewById(R.id.recibir_nuevos);

        Amigos amigos = new Amigos();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.main, amigos);
        fragmentTransaction.commit();
    }

    public void setListener(final Amigos amigos){
        recibir_nuevos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amigos.getLoadingPanel().setVisibility(View.VISIBLE);
                new GetAmigos_AsyncTask(amigos).execute("http://localhost:8080/FreendsWS/FriendsService.jsp?user=2");
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        return super.onOptionsItemSelected(item);
    }

}
