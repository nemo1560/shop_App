package com.example.nemo1.detailfilm_reponse;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class imgZoom extends Fragment implements View.OnClickListener {

    private ImageView imgFilmZoom;
    private TextView back,summaryFilm;
    public imgZoom() {

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.img_zoom,container,false);
        imgFilmZoom = view.findViewById(R.id.imgFilmZoom);
        summaryFilm = view.findViewById(R.id.summary);
        back = view.findViewById(R.id.back);
        back.setOnClickListener(this);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    public void displayFilm(eFilm eFilm){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(eFilm.getMfilmName());
        builder.setMessage(eFilm.getmSummary());
        builder.setNegativeButton("OK",null);
        builder.create().show();
        imgFilmZoom.setImageResource(eFilm.getmImgFilm());
        summaryFilm.setText(eFilm.getmSummary());
    }

    @Override
    public void onClick(View v) {
        /*
        *
        * remove destination fragment and replace fragment.
        *
        * */
        getActivity().finish();
    }
}
