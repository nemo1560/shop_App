package com.example.nemo1.cardview.entity;

public class eCar {
    private int imgCar;
    private String nameCar;
    private String count;

    public eCar(int imgCar, String nameCar, String count) {
        this.imgCar = imgCar;
        this.nameCar = nameCar;
        this.count = count;
    }

    public int getImgCar() {
        return imgCar;
    }

    public void setImgCar(int imgCar) {
        this.imgCar = imgCar;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
