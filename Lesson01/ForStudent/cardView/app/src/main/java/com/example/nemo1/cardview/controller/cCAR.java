package com.example.nemo1.cardview.controller;

import com.example.nemo1.cardview.entity.eCar;
import com.example.nemo1.cardview.model.mCar;

import java.util.List;

public class cCAR {
    private List<eCar>eCarList;

    public List<eCar> geteCarList() {
        eCarList = new mCar().geteCarList();
        return eCarList;
    }
}
