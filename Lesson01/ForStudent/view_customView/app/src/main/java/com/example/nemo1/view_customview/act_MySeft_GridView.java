package com.example.nemo1.view_customview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import com.example.nemo1.view_customview.adapter.myseftAdapter;
import com.example.nemo1.view_customview.controller.cMyseft;
import com.example.nemo1.view_customview.entity.eMyseft;

import java.util.List;

public class act_MySeft_GridView extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview_custom);
        initButton();
    }

    private GridView gridView;
    private myseftAdapter myseftAdapter;
    private List<eMyseft> eMyseftList;

    public void initButton(){
        this.gridView = findViewById(R.id.icon_group);
        setAdapter();
    }
    public void setAdapter(){
        eMyseftList = new cMyseft().getData();
        myseftAdapter = new myseftAdapter(act_MySeft_GridView.this,R.layout.grid_myseft,eMyseftList);
        gridView.setAdapter(myseftAdapter);
    }
}
