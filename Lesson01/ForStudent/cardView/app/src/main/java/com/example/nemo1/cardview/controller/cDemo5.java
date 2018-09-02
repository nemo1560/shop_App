package com.example.nemo1.cardview.controller;

import com.example.nemo1.cardview.entity.eDemo5;
import com.example.nemo1.cardview.model.mDemo5;

import java.util.ArrayList;
import java.util.List;

public class cDemo5 {
    private List<eDemo5>eDemo5List;

    public List<eDemo5> geteDemo5List() {
        eDemo5List = new ArrayList<>();
        eDemo5List = new mDemo5().geteDemo5List();
        return eDemo5List;
    }
}
