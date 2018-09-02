package com.example.nemo1.view_customview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import com.example.nemo1.view_customview.adapter.demo4Adapter;
import com.example.nemo1.view_customview.controller.cDemo4;
import com.example.nemo1.view_customview.entity.eDemo4;

import java.util.List;

public class act_Demo4 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview_custom);
        initEvent();
    }

    private GridView gridView;
    private demo4Adapter demo4Adapter;
    private List<eDemo4> eDemo4List;
    public void initEvent(){
        gridView = findViewById(R.id.icon_group);
        createAdapter();
    }

    public void createAdapter(){
        eDemo4List = new cDemo4().geteDemo4List();
        demo4Adapter = new demo4Adapter(act_Demo4.this,R.layout.lt_demo4,eDemo4List);
        gridView.setAdapter(demo4Adapter);
    }
}
