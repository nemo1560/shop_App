package com.example.nemo1.musicplayer.model;

import android.util.Log;

import com.example.nemo1.musicplayer.R;
import com.example.nemo1.musicplayer.entity.eSong;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

public class mSong {
    private List<eSong> eSongList;
    private static String path = "raw";

    public List<eSong> geteSongList() {
        //them duong dan toi folder
        File[] file = new File("/R.raw/").listFiles();
        Log.d("Size",String.valueOf(file.length));
        //doc file mp3 vao List ( thoa dk filter duoi mp3)
        eSongList = new ArrayList<>();
        for(int i=0;i<file.length;i++){
            eSongList.add(new eSong(file[i].getName(),file[i].getPath()));
        }
        return eSongList;
    }

    //Lay cac file co duoi mp3
    class FileExtFilter implements FilenameFilter {
        @Override
        public boolean accept(File dir, String name) {
            if(name.endsWith(".mp3")||name.endsWith(".MP3")){
                return true;
            }
            return false;
        }
    }
}
