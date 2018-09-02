package com.example.nemo1.cardview.model;

import com.example.nemo1.cardview.R;
import com.example.nemo1.cardview.entity.eDemo3;

import java.util.ArrayList;
import java.util.List;

public class mDemo3 {

    private List<eDemo3> eDemo3List;
    private eDemo3[] eDemo3s;

    public List<eDemo3> getmDemo3List() {
        eDemo3s = new eDemo3[15];
        eDemo3List = new ArrayList<>();

        for(int i=0;i<eDemo3s.length;i++){
            eDemo3s[i] = new eDemo3(R.mipmap.sg2,"Demo","This demo text");
            eDemo3List.add(eDemo3s[i]);
        }
        return eDemo3List;
    }
}
