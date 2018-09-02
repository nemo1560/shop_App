package com.example.nemo1.view_customview.controller;

import com.example.nemo1.view_customview.entity.eFruit;
import com.example.nemo1.view_customview.model.mGrid_Fruit;

import java.util.List;

public class cGrid_Fruit {
    private List<eFruit> eFruitList;

    public List<eFruit> geteFruitList() {
        eFruitList = new mGrid_Fruit().getData();
        return eFruitList;
    }
}
