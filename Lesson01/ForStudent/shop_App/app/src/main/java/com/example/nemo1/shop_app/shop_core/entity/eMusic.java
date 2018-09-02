package com.example.nemo1.shop_app.shop_core.entity;

public class eMusic {
    private String nameM;
    private int imgM;
    private String singerM;

    public eMusic(String nameM, int imgM, String singerM) {
        this.nameM = nameM;
        this.imgM = imgM;
        this.singerM = singerM;
    }

    public String getNameM() {
        return nameM;
    }

    public void setNameM(String nameM) {
        this.nameM = nameM;
    }

    public int getImgM() {
        return imgM;
    }

    public void setImgM(int imgM) {
        this.imgM = imgM;
    }

    public String getSingerM() {
        return singerM;
    }

    public void setSingerM(String singerM) {
        this.singerM = singerM;
    }
}
