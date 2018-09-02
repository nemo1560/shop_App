package com.example.nemo1.lifecycle_activity.entity;

public class songs {
    private int songImage;
    private String songName;


    public songs( int songImage, String songName) {
        this.songImage = songImage;
        this.songName = songName;
    }

    public songs() {
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public int getSongImage() {
        return songImage;
    }

    public void setSongImage(int songImage) {
        this.songImage = songImage;
    }
}
