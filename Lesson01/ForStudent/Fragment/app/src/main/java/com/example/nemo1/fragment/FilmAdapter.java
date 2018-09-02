package com.example.nemo1.fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FilmAdapter extends BaseAdapter {

    private Context mContext;
    private List<Film> mFilms;

    public FilmAdapter(Context mContext, List<Film> mFilms) {
        this.mContext = mContext;
        this.mFilms = mFilms;
    }

    @Override
    public int getCount() {
        return mFilms.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(mContext).inflate(R.layout.item_film, null);
        ImageView imgAvata = view.findViewById(R.id.img_avata);
        TextView txtFilmName = view.findViewById(R.id.txt_filmName);
        TextView txtRating = view.findViewById(R.id.txt_rating);
        TextView txtYear = view.findViewById(R.id.txt_year);
        TextView txtGenre = view.findViewById(R.id.txt_renge);

        Film film  = (Film) getItem(i);
        imgAvata.setImageResource(film.getmImgFilm());
        txtFilmName.setText(film.getMfilmName());
        txtRating.setText(film.getmRating());
        txtYear.setText(film.getmYear());
        txtGenre.setText(film.getmGenre());
        return view;
    }
}
