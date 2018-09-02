package com.example.nemo1.cardview.controller;

import com.example.nemo1.cardview.entity.eDemo2;
import com.example.nemo1.cardview.model.mDemo2;

import java.util.List;

public class cDemo2 {
    private List<eDemo2> eDemo2List;

    public List<eDemo2> geteDemo2List() {
        eDemo2List = new mDemo2().getmDemo2List();
        return eDemo2List;
    }
}

