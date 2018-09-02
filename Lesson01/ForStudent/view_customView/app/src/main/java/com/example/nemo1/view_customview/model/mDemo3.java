package com.example.nemo1.view_customview.model;

import android.util.Log;

import com.example.nemo1.view_customview.R;
import com.example.nemo1.view_customview.entity.eDemo3;

import java.util.ArrayList;
import java.util.List;

public class mDemo3 {
    private List<eDemo3> eDemo3List;
    private eDemo3[] eDemo3;

    private List<eDemo3> getData() {
        eDemo3List = new ArrayList<>();
        eDemo3 = new eDemo3[7];
        for (int i = 0; i < eDemo3.length; i++) {
            eDemo3[i] = new eDemo3("JavaSampleApproach", R.mipmap.recycle, R.mipmap.pen);
            eDemo3List.add(eDemo3[i]);
        }
        Log.d("tee",String.valueOf(eDemo3List.size()));
        return eDemo3List;
    }
    public List<com.example.nemo1.view_customview.entity.eDemo3> geteDemo3List() {
        eDemo3List = getData();
        return eDemo3List;
    }
}
