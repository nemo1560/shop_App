package com.example.nemo1.musicplayer.entity;

public class eSong {
    private String source;
    private String song;
    private String singer;

    public eSong(String source, String song) {
        this.source = source;
        this.song = song;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

}
