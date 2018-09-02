package com.example.nemo1.view_customview.controller;

import com.example.nemo1.view_customview.entity.eMyseft;
import com.example.nemo1.view_customview.model.mMyseft;

import java.util.List;

public class cMyseft {
    private List<eMyseft> eMysefts;
    public List getData(){
        eMysefts = new mMyseft().geteMyseftList();
        return eMysefts;
    }
}
