package com.example.nemo1.lifecycle_activity.Model;

import com.example.nemo1.lifecycle_activity.R;
import com.example.nemo1.lifecycle_activity.entity.songs;

import java.util.ArrayList;
import java.util.List;

public class sourceSong {
    private List<songs>listSongs;

    public List songsList(){
        songs songs1 = new songs(R.mipmap.rebel300,"bai1");
        songs songs2 = new songs(R.mipmap.rebel300,"bai2");
        songs songs3 = new songs(R.mipmap.rebel300,"bai3");
        songs songs4 = new songs(R.mipmap.rebel300,"bai4");
        songs songs5 = new songs(R.mipmap.rebel300,"bai5");
        songs songs6 = new songs(R.mipmap.rebel300,"bai6");
        listSongs = new ArrayList<>();
        listSongs.add(songs1);
        listSongs.add(songs2);
        listSongs.add(songs3);
        listSongs.add(songs4);
        listSongs.add(songs5);
        listSongs.add(songs6);
        return listSongs;
    }
}
