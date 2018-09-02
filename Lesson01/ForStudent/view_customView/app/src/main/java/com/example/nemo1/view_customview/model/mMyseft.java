package com.example.nemo1.view_customview.model;

import com.example.nemo1.view_customview.R;
import com.example.nemo1.view_customview.entity.eMyseft;

import java.util.ArrayList;
import java.util.List;

public class mMyseft {
    private List<eMyseft> eMyseftList;

    public List<eMyseft> geteMyseftList() {
        eMyseft eMyseft1 = new eMyseft(R.mipmap.bell,"Alarm");
        eMyseft eMyseft2 = new eMyseft(R.mipmap.android,"Android");
        eMyseft eMyseft3 = new eMyseft(R.mipmap.mobile,"Mobile");
        eMyseft eMyseft4 = new eMyseft(R.mipmap.web,"Website");
        eMyseft eMyseft5 = new eMyseft(R.mipmap.profile,"Profile");
        eMyseft eMyseft6 = new eMyseft(R.mipmap.wordpress,"wordpress");

        eMyseftList = new ArrayList<>();
        eMyseftList.add(eMyseft1);
        eMyseftList.add(eMyseft2);
        eMyseftList.add(eMyseft3);
        eMyseftList.add(eMyseft4);
        eMyseftList.add(eMyseft5);
        eMyseftList.add(eMyseft6);

        return eMyseftList;
    }
}
