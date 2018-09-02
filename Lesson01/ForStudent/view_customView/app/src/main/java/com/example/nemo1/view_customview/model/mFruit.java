package com.example.nemo1.view_customview.model;

import com.example.nemo1.view_customview.R;
import com.example.nemo1.view_customview.entity.eFruit;

import java.util.ArrayList;
import java.util.List;

public class mFruit {
    private List list;
    private static String text = "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...";

    public List<eFruit> getList() {
        this.list = addData();
        return list;
    }
    public List<eFruit> addData(){
        eFruit eFruit1 = new eFruit(R.mipmap.apple_fruit,"Apple",text);
        eFruit eFruit2 = new eFruit(R.mipmap.banana_fruit,"Banana",text);
        eFruit eFruit3 = new eFruit(R.mipmap.lemon_fruit,"Lemon",text);
        eFruit eFruit4 = new eFruit(R.mipmap.cherry_fruit,"Cherry",text);
        eFruit eFruit5 = new eFruit(R.mipmap.strawberry_fruit,"Strawberry",text);
        eFruit eFruit6 = new eFruit(R.mipmap.avocado_fruit,"Avocado",text);

        list = new ArrayList();
        list.add(eFruit1);
        list.add(eFruit2);
        list.add(eFruit3);
        list.add(eFruit4);
        list.add(eFruit5);
        list.add(eFruit6);

        return list;
    }

}
