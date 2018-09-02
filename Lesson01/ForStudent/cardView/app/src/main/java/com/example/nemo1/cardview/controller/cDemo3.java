package com.example.nemo1.cardview.controller;

import com.example.nemo1.cardview.entity.eDemo3;
import com.example.nemo1.cardview.model.mDemo3;

import java.util.List;

public class cDemo3 {
    private List<eDemo3> eDemo3List;

    public List<eDemo3> geteDemo3List() {
        eDemo3List = new mDemo3().getmDemo3List();
        return eDemo3List;
    }
}
