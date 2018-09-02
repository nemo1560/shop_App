package com.example.nemo1.shop_app.shop_core;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.nemo1.shop_app.R;
import com.example.nemo1.shop_app.shop_core.data.adapter_film;
import com.example.nemo1.shop_app.shop_core.data.mFilm;
import com.example.nemo1.shop_app.shop_core.entity.eFilm;

import java.util.List;

public class fragment_film extends Fragment{
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    private GridView gridView;
    private adapter_film adapter_film;
    private List<eFilm> eFilmList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_film,container,false);
        gridView = view.findViewById(R.id.fragment_film);
        eFilmList = new mFilm().geteFilmList();
        /*
        * R.layout.gridview_film => callback layout row customListView to show in adapter.
        * */
        adapter_film = new adapter_film(getContext(),R.layout.gridview_film,eFilmList);
        gridView.setAdapter(adapter_film);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
