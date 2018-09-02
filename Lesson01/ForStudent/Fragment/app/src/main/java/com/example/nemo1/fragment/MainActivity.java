package com.example.nemo1.fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
        implements FragmentFilm.OnClickListner{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void OnClicked(Film film) {
        FragmentDetailFilm detailFilm = (FragmentDetailFilm) getSupportFragmentManager()
                .findFragmentById(R.id.fm_detail_film);

        if (detailFilm != null && detailFilm.isInLayout()){
            detailFilm.displayFilm(film);
        }
    }
}
