package com.example.nemo1.view_customview.controller;

import com.example.nemo1.view_customview.entity.eDemo3;
import com.example.nemo1.view_customview.model.mDemo3;

import java.util.List;

public class cDemo3 {
    private List<eDemo3>eDemo3List;

    public List<eDemo3> geteDemo3List() {
        mDemo3 mDemo3 = new mDemo3();
        eDemo3List = mDemo3.geteDemo3List();
        return eDemo3List;
    }
}
