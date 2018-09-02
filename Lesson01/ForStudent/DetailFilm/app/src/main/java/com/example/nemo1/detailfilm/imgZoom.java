package com.example.nemo1.detailfilm;

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

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.img_zoom,container,false);
        imgFilmZoom = view.findViewById(R.id.imgFilmZoom);
        summaryFilm = view.findViewById(R.id.summary);
        back = view.findViewById(R.id.back);
        back.setOnClickListener(this);

        /*
        *
        * get Bundle object from listfilm fragment
        * */
        Bundle bundle = getArguments();
        int img = bundle.getInt("img",-1);
        String summary = bundle.getString("summary");
        displayFilm(img,summary);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    public void displayFilm(int img, String summary){
        imgFilmZoom.setImageResource(img);
        summaryFilm.setText(summary);
    }

    @Override
    public void onClick(View v) {
        /*
        *
        * remove destination fragment and replace fragment.
        *
        * */
        Fragment fragment = new listFilm();
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.listFilm_frament,fragment);
        fragmentTransaction.commit();
    }
}
