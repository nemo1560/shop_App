package com.example.nemo1.view_customview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.nemo1.view_customview.adapter.demo6Adapter;
import com.example.nemo1.view_customview.controller.cDemo6;
import com.example.nemo1.view_customview.entity.eDemo6;

import java.util.List;

public class act_Demo6_ListView extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lt_listview_custom);
    }

    @Override
    protected void onStart() {
        initEvent();
        super.onStart();
    }

    private ListView listView;
    private demo6Adapter demo6Apdapter;
    private List<eDemo6> eDemo6List;

    public void initEvent(){
        listView = findViewById(R.id.list_item);
        creatAdapter();
    }

    public void creatAdapter(){
        eDemo6List = new cDemo6().geteDemo6List();
        demo6Apdapter = new demo6Adapter(act_Demo6_ListView.this,R.layout.lt_demo6,eDemo6List);
        listView.setAdapter(demo6Apdapter);
    }
}
