package com.example.nemo1.view_customview.model;

import com.example.nemo1.view_customview.entity.sv;

import java.util.ArrayList;
import java.util.List;

public class mSv {

    public List<sv> getData(){
        List list = new ArrayList();
        sv sv1 = new sv("A","lop 1",07);
        sv sv2 = new sv("B","lop 2",02);
        sv sv3 = new sv("C","lop 3",05);
        sv sv4 = new sv("D","lop 4",07);

        list.add(sv1);
        list.add(sv2);
        list.add(sv3);
        list.add(sv4);

        return list;
    }
}
