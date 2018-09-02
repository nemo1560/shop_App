package com.example.nemo1.shop_app.shop_core;

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

import com.example.nemo1.shop_app.R;
import com.example.nemo1.shop_app.shop_core.data.adapter_music;
import com.example.nemo1.shop_app.shop_core.data.mMusic;
import com.example.nemo1.shop_app.shop_core.entity.eMusic;

import java.util.List;

public class fragment_music extends Fragment {
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    private adapter_music adapter_music;
    private List<eMusic> eMusicList;
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_music,container,false);
        eMusicList = new mMusic().geteMusicList();
        adapter_music = new adapter_music(getActivity(),eMusicList);
        recyclerView = view.findViewById(R.id.fragment_music);
        recyclerView.setAdapter(adapter_music);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
