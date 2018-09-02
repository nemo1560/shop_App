package com.example.nemo1.cardview.model;

import com.example.nemo1.cardview.R;
import com.example.nemo1.cardview.entity.eDemo2;

import java.util.ArrayList;
import java.util.List;

public class mDemo2 {
    private List<eDemo2> eDemo2List;
    private eDemo2[] eDemo2s;

    public List<eDemo2> getmDemo2List() {
        eDemo2s = new eDemo2[15];
        eDemo2List = new ArrayList<>();

        for(int i=0;i<eDemo2s.length;i++){
            eDemo2s[i] = new eDemo2(R.mipmap.sg2,"Demo","This demo text");
            eDemo2List.add(eDemo2s[i]);
        }
        return eDemo2List;
    }
}
