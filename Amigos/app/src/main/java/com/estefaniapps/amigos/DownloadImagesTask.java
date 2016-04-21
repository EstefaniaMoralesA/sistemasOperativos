package com.estefaniapps.amigos;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.util.Log;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownloadImagesTask extends AsyncTask<ImageInfo, Void, RoundedBitmapDrawable> {

    ImageView imageView = null;
    Amigo amigo = null;

    @Override
    protected RoundedBitmapDrawable doInBackground(ImageInfo... images) {
        this.imageView = images[0].getImageView();
        this.amigo = images[0].getAmigo();
        return download_Image(amigo.getFoto());
    }

    @Override
    protected void onPostExecute(RoundedBitmapDrawable result) {
        amigo.setRoundedFoto(result);
        imageView.setImageDrawable(result);
    }

    private RoundedBitmapDrawable download_Image(String url) {
        Bitmap bmp =null;
        try{
            URL ulrn = new URL(url);
            HttpURLConnection con = (HttpURLConnection)ulrn.openConnection();
            InputStream is = con.getInputStream();
            bmp = BitmapFactory.decodeStream(is);
            if (null != bmp)
                return getRoundedFoto(bmp);

        }catch(Exception e){
            Log.e("Exception", e.getMessage());
        }
        return null;
    }

    public RoundedBitmapDrawable getRoundedFoto(Bitmap avatar){
        RoundedBitmapDrawable roundDrawable = RoundedBitmapDrawableFactory.create(null, avatar);
        roundDrawable.setCircular(true);
        return roundDrawable;
    }
}

