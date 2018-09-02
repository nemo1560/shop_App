package com.example.nemo1.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class FragmentDetailFilm extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private ImageView imgFilm;
    private TextView tvFilmName;
    private TextView tvRating;
    private TextView tvYear;
    private TextView tvGenre;
    private View view;

    public FragmentDetailFilm() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_detail_film, container, false);
        imgFilm = view.findViewById(R.id.img_film);
        tvFilmName = view.findViewById(R.id.tv_filmName);
        tvRating = view.findViewById(R.id.tv_rating);
        tvYear = view.findViewById(R.id.tv_year);
        tvGenre = view.findViewById(R.id.tv_renge);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    public void displayFilm(Film film) {
        imgFilm.setImageResource(film.getmImgFilm());
        tvFilmName.setText(film.getMfilmName());
        tvRating.setText(film.getmRating());
        tvYear.setText(film.getmYear());
        tvGenre.setText(film.getmGenre());
    }
}
