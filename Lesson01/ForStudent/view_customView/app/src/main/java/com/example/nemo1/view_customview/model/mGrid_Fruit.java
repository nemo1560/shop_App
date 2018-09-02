package com.example.nemo1.view_customview.model;

import com.example.nemo1.view_customview.R;
import com.example.nemo1.view_customview.entity.eFruit;

import java.util.ArrayList;
import java.util.List;

public class mGrid_Fruit {
    private List<eFruit> eFruitList;

    public List<eFruit> getData(){
        eFruitList = new ArrayList<>();
        eFruit eFruit1 = new eFruit(R.mipmap.apple_fruit,"Apple");
        eFruit eFruit2 = new eFruit(R.mipmap.strawberry_fruit,"Strawberry");
        eFruit eFruit3 = new eFruit(R.mipmap.banana_fruit,"Banana");
        eFruit eFruit4 = new eFruit(R.mipmap.avocado_fruit,"Avocado");
        eFruit eFruit5 = new eFruit(R.mipmap.lemon_fruit,"Lemon");
        eFruit eFruit6 = new eFruit(R.mipmap.cherry_fruit,"Cherry");

        eFruitList.add(eFruit1);
        eFruitList.add(eFruit2);
        eFruitList.add(eFruit3);
        eFruitList.add(eFruit4);
        eFruitList.add(eFruit5);
        eFruitList.add(eFruit6);
        return eFruitList;
    }
}
