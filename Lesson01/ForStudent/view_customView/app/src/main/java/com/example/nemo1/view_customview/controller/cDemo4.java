package com.example.nemo1.view_customview.controller;

import com.example.nemo1.view_customview.entity.eDemo4;
import com.example.nemo1.view_customview.model.mDemo4;

import java.util.List;

public class cDemo4 {
    private List<eDemo4>eDemo4List;

    public List<eDemo4> geteDemo4List() {
        eDemo4List = new mDemo4().geteDemo4List();
        return eDemo4List;
    }
}
