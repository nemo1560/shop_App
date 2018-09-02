package com.example.nemo1.cardview.model;

import com.example.nemo1.cardview.R;
import com.example.nemo1.cardview.entity.eDemo5;

import java.util.ArrayList;
import java.util.List;

public class mDemo5 {
    private List<eDemo5>eDemo5List;
    private eDemo5[] eDemo5s;

    public List<eDemo5> geteDemo5List() {
        eDemo5List = new ArrayList<>();
        eDemo5s = new eDemo5[10];
        for(int i=0;i<eDemo5s.length;i++){
            eDemo5s[i] = new eDemo5(R.mipmap.sg1);
            eDemo5List.add(eDemo5s[i]);
        }
        return eDemo5List;
    }
}
