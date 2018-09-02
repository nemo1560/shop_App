package com.example.nemo1.fragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    private Film film;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        film = (Film) getIntent().getSerializableExtra("detail");
        FragmentDetailFilm fragmentDetailFilm = (FragmentDetailFilm) getSupportFragmentManager()
                .findFragmentById(R.id.fm_detail_film);
        fragmentDetailFilm.displayFilm(film);
    }
}
