package com.example.nemo1.view_customview.controller;

import com.example.nemo1.view_customview.entity.eDemo6;
import com.example.nemo1.view_customview.model.mDemo6;

import java.util.List;

public class cDemo6 {
    private List<eDemo6> eDemo6List;

    public List<eDemo6> geteDemo6List() {
        eDemo6List = new mDemo6().geteDemo6List();
        return eDemo6List;
    }
}
