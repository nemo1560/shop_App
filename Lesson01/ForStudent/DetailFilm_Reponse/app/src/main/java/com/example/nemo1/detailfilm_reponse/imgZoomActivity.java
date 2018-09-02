package com.example.nemo1.detailfilm_reponse;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class imgZoomActivity extends AppCompatActivity{
    private eFilm eFilm;
    private imgZoom imgZoom;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img_zoom);
        Intent intent = getIntent();
        imgZoom = (com.example.nemo1.detailfilm_reponse.imgZoom) getSupportFragmentManager().findFragmentById(R.id.imgZoom_frament);
        eFilm = (com.example.nemo1.detailfilm_reponse.eFilm) intent.getSerializableExtra("eFilm");
        Log.e("ten phim", eFilm.getMfilmName()+ " "+ eFilm.getmSummary());
        if(!eFilm.equals(null)){
            try{
                imgZoom.displayFilm(eFilm);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }

    }
    public eFilm getData(){
        return eFilm;
    }
}
