package com.estefaniapps.amigos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import android.os.AsyncTask;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;


public class GetAmigos_AsyncTask extends AsyncTask<String, Void, String> {

    private Amigos amigos;

    public GetAmigos_AsyncTask(Amigos amigos){
        this.amigos = amigos;
    }

    @Override
    protected String doInBackground(String... params) {
        String strResponse = "";
        try {
            URL url = new URL(params[0]);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setReadTimeout(15000);
            conn.setConnectTimeout(15000);
            conn.setRequestMethod("GET");

            int responseCode = conn.getResponseCode();

            if(responseCode == HttpURLConnection.HTTP_OK){
                String line;
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(conn.getInputStream()));
                while((line = br.readLine()) != null){
                    strResponse += line;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return strResponse;
    }

    @Override
    protected void onPostExecute(String result){
        try {
            JSONObject jsonObject = new JSONObject(result);
            JSONArray arreglo = jsonObject.getJSONArray("amigos");
            ArrayList<Amigo> amigos = new ArrayList<>();

            for(int i = 0; i < arreglo.length(); i++){
                jsonObject = arreglo.getJSONObject(i);
                amigos.add(new Amigo(jsonObject.getString("nombre"), jsonObject.getString("foto")));
            }

            this.amigos.populateListView(amigos);

        } catch (Exception e) {
            Log.d("ReadWeatherJSONFeedTask", e.getMessage());
        }
    }

    @Override
    protected void onPreExecute(){
    }

    @Override
    protected void onProgressUpdate(Void... values){

    }

}