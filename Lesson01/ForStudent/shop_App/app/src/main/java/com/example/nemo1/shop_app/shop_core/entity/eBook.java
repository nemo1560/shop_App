package com.example.nemo1.shop_app.shop_core.entity;

public class eBook {
    private int img_book;
    private String name_book;
    private String summary_book;

    public eBook(int img_book, String name_book, String summary_book) {
        this.img_book = img_book;
        this.name_book = name_book;
        this.summary_book = summary_book;
    }

    public int getImg_book() {
        return img_book;
    }

    public void setImg_book(int img_book) {
        this.img_book = img_book;
    }

    public String getName_book() {
        return name_book;
    }

    public void setName_book(String name_book) {
        this.name_book = name_book;
    }

    public String getSummary_book() {
        return summary_book;
    }

    public void setSummary_book(String summary_book) {
        this.summary_book = summary_book;
    }
}
