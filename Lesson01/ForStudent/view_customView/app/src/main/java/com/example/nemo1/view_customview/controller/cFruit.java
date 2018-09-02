package com.example.nemo1.view_customview.controller;

import com.example.nemo1.view_customview.entity.eFruit;
import com.example.nemo1.view_customview.model.mFruit;

import java.util.List;

public class cFruit {
    private List<eFruit> fruits;

    public List getList(){
        mFruit mFruit = new mFruit();
        fruits = mFruit.getList();
        return fruits;
    }
}
