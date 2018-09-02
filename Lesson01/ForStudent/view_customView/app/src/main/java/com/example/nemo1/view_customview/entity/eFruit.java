package com.example.nemo1.view_customview.entity;

public class eFruit {
    private int image;
    private String name;
    private String content;

    public eFruit() {
    }

    public eFruit(int image, String name, String content) {
        this.image = image;
        this.name = name;
        this.content = content;
    }

    public eFruit(int image, String name) {
        this.image = image;
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
