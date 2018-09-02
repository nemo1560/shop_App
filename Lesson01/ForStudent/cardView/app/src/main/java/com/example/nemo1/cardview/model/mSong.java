package com.example.nemo1.cardview.model;

import com.example.nemo1.cardview.entity.eSong;

import java.util.ArrayList;
import java.util.List;

public class mSong {
    private List<eSong> eSongList;

    public List<eSong> geteSongList() {
        eSongList = new ArrayList<>();
        eSong eSong1 = new eSong(android.R.drawable.ic_dialog_info,"Test1");
        eSong eSong2 = new eSong(android.R.drawable.ic_dialog_info,"Test2");
        eSongList.add(eSong1);
        eSongList.add(eSong2);
        return eSongList;
    }
}
