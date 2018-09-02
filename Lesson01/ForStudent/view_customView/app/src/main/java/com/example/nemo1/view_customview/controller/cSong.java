package com.example.nemo1.view_customview.controller;

import com.example.nemo1.view_customview.entity.eSong;
import com.example.nemo1.view_customview.model.mSong;

import java.util.List;

public class cSong {
    private List<eSong> eSongList;

    public List<eSong> geteSongList() {
        eSongList = new mSong().geteSongList();
        return eSongList;
    }
}
