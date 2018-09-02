package com.example.nemo1.detailfilm_reponse;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements adpFilm.ListFilmOnClick{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void OnClicked(eFilm eFilm) {
        imgZoom imgZoom = (com.example.nemo1.detailfilm_reponse.imgZoom) getSupportFragmentManager().findFragmentById(R.id.imgZoom_frament);
        if (imgZoom != null && imgZoom.isInLayout()) {
            imgZoom.displayFilm(eFilm);
        }
    }
}
