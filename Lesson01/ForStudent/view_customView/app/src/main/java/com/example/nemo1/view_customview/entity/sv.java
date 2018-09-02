package com.example.nemo1.view_customview.entity;

import java.io.Serializable;

public class sv implements Serializable {
    private String name;
    private String email;
    private float diem;

    public sv(String name, String email, float diem) {
        this.name = name;
        this.email = email;
        this.diem = diem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public sv() {
    }
}
