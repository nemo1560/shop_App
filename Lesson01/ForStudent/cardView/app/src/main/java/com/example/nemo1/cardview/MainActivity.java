package com.example.nemo1.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.nemo1.cardview.adapter.adapterCardView;
import com.example.nemo1.cardview.controller.cSong;
import com.example.nemo1.cardview.entity.eSong;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private adapterCardView adapterCardView;
    private List<eSong> eSongList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycleview_example);
        initControl();
    }

    public void initControl(){
        recyclerView = findViewById(R.id.recyclerView);
        eSongList = new ArrayList<>();
        eSongList = new cSong().geteSongList();
        adapterCardView = new adapterCardView(this,eSongList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapterCardView);
    }
}
