package com.example.nemo1.view_customview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.nemo1.view_customview.adapter.songAdapter;
import com.example.nemo1.view_customview.controller.cSong;
import com.example.nemo1.view_customview.entity.eSong;

import java.util.List;

public class act_ListView_Song extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lt_listview_custom);
    }

    @Override
    protected void onStart() {
        initEvent();
        super.onStart();
    }

    private List<eSong> eSongList;
    private songAdapter songAdapter;
    private ListView listView;

    public void initEvent(){
        listView = findViewById(R.id.list_item);
        creatAdapter();
    }

    public void creatAdapter(){
        eSongList = new cSong().geteSongList();
        songAdapter = new songAdapter(act_ListView_Song.this,R.layout.lt_song,eSongList);
        listView.setAdapter(songAdapter);
    }
}
