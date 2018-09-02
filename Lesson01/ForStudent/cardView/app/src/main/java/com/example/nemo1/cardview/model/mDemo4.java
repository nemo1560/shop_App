package com.example.nemo1.cardview.model;

import com.example.nemo1.cardview.R;
import com.example.nemo1.cardview.entity.eDemo4;

import java.util.ArrayList;
import java.util.List;

public class mDemo4 {
    private List<eDemo4> eDemo4List;
    private eDemo4[] eDemo4s;
    public List<eDemo4> geteDemo4List() {
        eDemo4s = new eDemo4[15];
        eDemo4List = new ArrayList<>();

        for(int i=0;i<eDemo4s.length;i++){
            eDemo4s[i] = new eDemo4(R.mipmap.apple_touch_icon,"Android Wrrriors", "Place to dive into android programing");
            eDemo4List.add(eDemo4s[i]);
        }
        return eDemo4List;
    }
}
