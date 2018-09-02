package com.example.nemo1.gui.Entity;

public class eRegistration {
    private String name_Res;
    private int age_Res;
    private String sex_Res;
    private String status_Res;

    public eRegistration(String name_Res, int age_Res, String sex_Res, String status_Res) {
        this.name_Res = name_Res;
        this.age_Res = age_Res;
        this.sex_Res = sex_Res;
        this.status_Res = status_Res;
    }

    public eRegistration() {
    }

    public String getName_Res() {
        return name_Res;
    }

    public void setName_Res(String name_Res) {
        this.name_Res = name_Res;
    }

    public int getAge_Res() {
        return age_Res;
    }

    public void setAge_Res(int age_Res) {
        this.age_Res = age_Res;
    }

    public String getSex_Res() {
        return sex_Res;
    }

    public void setSex_Res(String sex_Res) {
        this.sex_Res = sex_Res;
    }

    public String getStatus_Res() {
        return status_Res;
    }

    public void setStatus_Res(String status_Res) {
        this.status_Res = status_Res;
    }
}
