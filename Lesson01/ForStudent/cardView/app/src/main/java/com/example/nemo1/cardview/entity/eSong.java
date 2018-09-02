package com.example.nemo1.cardview.entity;

public class eSong {
    private int imgSong;
    private String nameSong;

    public eSong(int imgSong, String nameSong) {
        this.imgSong = imgSong;
        this.nameSong = nameSong;
    }

    public int getImgSong() {
        return imgSong;
    }

    public void setImgSong(int imgSong) {
        this.imgSong = imgSong;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }
}
