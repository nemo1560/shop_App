package com.example.nemo1.shop_app.shop_core.entity;

public class eFilm {
    private int img_film;
    private String name_film;
    private String kind_film;

    public eFilm(int img_film, String name_film, String kind_film) {
        this.img_film = img_film;
        this.name_film = name_film;
        this.kind_film = kind_film;
    }

    public int getImg_film() {
        return img_film;
    }

    public void setImg_film(int img_film) {
        this.img_film = img_film;
    }

    public String getName_film() {
        return name_film;
    }

    public void setName_film(String name_film) {
        this.name_film = name_film;
    }

    public String getKind_film() {
        return kind_film;
    }

    public void setKind_film(String kind_film) {
        this.kind_film = kind_film;
    }


}
