package com.example.nemo1.cardview.controller;

import com.example.nemo1.cardview.entity.eSong;
import com.example.nemo1.cardview.model.mSong;

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
