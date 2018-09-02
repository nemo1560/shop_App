package com.example.nemo1.view_customview.model;

import com.example.nemo1.view_customview.R;
import com.example.nemo1.view_customview.entity.eSong;

import java.util.ArrayList;
import java.util.List;

public class mSong {
    private List<eSong> eSongList;
    private eSong[] eSongs;

    public List<eSong> geteSongList() {
        eSongs = new eSong[7];
        eSongList = new ArrayList<>();
        for(int i=0;i<eSongs.length;i++){
            eSongs[i] = new eSong(R.mipmap.uhp,"Vi sao trong long toi","Ung Hoang Phuc","4:00");
            eSongList.add(eSongs[i]);
        }
        return eSongList;
    }

}
