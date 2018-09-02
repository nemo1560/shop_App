package com.example.nemo1.musicplayer.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.nemo1.musicplayer.R;
import com.example.nemo1.musicplayer.adapter.adapter_listSong;
import com.example.nemo1.musicplayer.controller.cSong;
import com.example.nemo1.musicplayer.entity.eSong;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        initButton();
    }

    private ImageView play,pause,stop;
    private adapter_listSong adapter_listSong;
    private ListView listView;

    public void initButton(){
        this.play = findViewById(R.id.play);
        this.pause = findViewById(R.id.pause);
        this.stop = findViewById(R.id.stop);
        this.listView = findViewById(R.id.playlist);
        initEvent();
    }

    public void initEvent(){
        play.setOnClickListener(this);
        pause.setOnClickListener(this);
        stop.setOnClickListener(this);
        //setAdapter_listSong(); loi null size
    }

    @Override
    public void onClick(View v) {

    }

    public void setAdapter_listSong(){
        List<eSong> eSongList = new ArrayList<>();
        eSongList = new cSong().geteSongList();
        adapter_listSong = new adapter_listSong(MainActivity.this,R.layout.playlist_layout,eSongList);
        listView.setAdapter(adapter_listSong);
    }
}
