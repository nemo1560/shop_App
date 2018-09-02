package com.example.nemo1.view_customview.model;

import com.example.nemo1.view_customview.R;
import com.example.nemo1.view_customview.entity.eDemo4;

import java.util.ArrayList;
import java.util.List;

public class mDemo4 {
    private List<eDemo4>eDemo4List;
    private eDemo4[] eDemo4s;
    public List<eDemo4> geteDemo4List() {
        eDemo4List = new ArrayList<>();
        eDemo4s = new eDemo4[10];
        for(int i=0;i<eDemo4s.length;i++){
            eDemo4s[i] = new eDemo4(R.mipmap.uhp,"Vi sao trong long toi");
            eDemo4List.add(eDemo4s[i]);
        }
        return eDemo4List;
    }
}
