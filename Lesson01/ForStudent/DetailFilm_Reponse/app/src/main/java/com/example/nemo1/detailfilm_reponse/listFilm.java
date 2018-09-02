package com.example.nemo1.detailfilm_reponse;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nemo1.detailfilm_reponse.R;
import com.example.nemo1.detailfilm_reponse.adpFilm;
import com.example.nemo1.detailfilm_reponse.dataFilm;
import com.example.nemo1.detailfilm_reponse.eFilm;

import java.util.List;
/*
* This is sub Activity (create View list_film_layout
* */
public class listFilm extends Fragment{

    private adpFilm adpFilm;
    private List<eFilm> eFilmList;
    private View view;
    private RecyclerView recyclerView;
    private com.example.nemo1.detailfilm_reponse.adpFilm.ListFilmOnClick listFilmOnClick;

    public listFilm() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        /*
         * set Adapter CardView cho RecycleView.
         * */
        view = inflater.inflate(R.layout.list_film_layout,container,false);
        eFilmList = new dataFilm().geteFilmList();
        recyclerView = view.findViewById(R.id.listFilm_layout);
        adpFilm = new adpFilm(eFilmList,getActivity());
        recyclerView.setAdapter(adpFilm);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
