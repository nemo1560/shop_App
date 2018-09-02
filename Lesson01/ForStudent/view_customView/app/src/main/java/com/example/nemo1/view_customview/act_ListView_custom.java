package com.example.nemo1.view_customview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.nemo1.view_customview.adapter.svAdapter;
import com.example.nemo1.view_customview.controller.csv;
import com.example.nemo1.view_customview.entity.sv;

import java.util.ArrayList;
import java.util.List;


public class act_ListView_custom extends AppCompatActivity implements AdapterView.OnItemClickListener{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lt_listview_custom);
        initControl();
    }

    private ListView listView;
    private List<sv> svList;
    private svAdapter svAdapter;

    public void initControl(){
        listView = findViewById(R.id.list_item);
        initEvent();
    }

    public void initEvent(){
        initData();
    }

    public void initData(){
        svList = new csv().getData();
        svAdapter = new svAdapter(act_ListView_custom.this,R.layout.lt_item_sv_custom,svList);
        listView.setAdapter(svAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}