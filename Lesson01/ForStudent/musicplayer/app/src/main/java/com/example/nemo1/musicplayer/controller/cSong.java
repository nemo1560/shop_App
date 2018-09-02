package com.example.nemo1.musicplayer.controller;

import android.os.Environment;

import com.example.nemo1.musicplayer.entity.eSong;
import com.example.nemo1.musicplayer.model.mSong;

import java.util.ArrayList;
import java.util.List;

public class cSong {
    private List<eSong>eSongList;

    public List<eSong> geteSongList() {
        eSongList = new ArrayList<>();
        eSongList = new mSong().geteSongList();
        return eSongList;
    }
}
