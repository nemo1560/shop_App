package com.example.nemo1.view_customview.model;

import com.example.nemo1.view_customview.R;
import com.example.nemo1.view_customview.entity.eDemo6;

import java.util.ArrayList;
import java.util.List;

public class mDemo6 {
    private List<eDemo6> eDemo6List;
    private eDemo6[] eDemo6s;

    public List<eDemo6> geteDemo6List() {
        eDemo6List = new ArrayList<>();
        eDemo6s = new eDemo6[10];
        for(int i=0;i<eDemo6s.length;i++){
            eDemo6s[i] = new eDemo6(R.mipmap.uhp,"Vi sao trong long toi","222222222222222222");
            eDemo6List.add(eDemo6s[i]);
        }
        return eDemo6List;
    }
}
