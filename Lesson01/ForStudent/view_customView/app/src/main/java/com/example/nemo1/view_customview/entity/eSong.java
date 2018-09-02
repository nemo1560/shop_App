package com.example.nemo1.view_customview.entity;

public class eSong {
    private int album;
    private String nameSong;
    private String singer;
    private String time;

    public eSong(int album, String nameSong, String singer, String time) {
        this.album = album;
        this.nameSong = nameSong;
        this.singer = singer;
        this.time = time;
    }

    public int getAlbum() {
        return album;
    }

    public void setAlbum(int album) {
        this.album = album;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
