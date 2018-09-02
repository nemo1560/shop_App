package com.example.nemo1.view_customview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.nemo1.view_customview.adapter.demo3Apdapter;
import com.example.nemo1.view_customview.controller.cDemo3;
import com.example.nemo1.view_customview.entity.eDemo3;

import java.util.List;

public class act_Demo3_ListView extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lt_listview_custom);
    }

    private ListView listView;
    private demo3Apdapter demo3Apdapter;
    private List<eDemo3> eDemo3List;

    @Override
    protected void onStart() {
        initButton();
        super.onStart();
    }

    public void initButton(){
        this.listView = findViewById(R.id.list_item);
        creatAdapter();
    }

    public void creatAdapter(){
        eDemo3List = new cDemo3().geteDemo3List();
        demo3Apdapter = new demo3Apdapter(act_Demo3_ListView.this,R.layout.lt_demo3,eDemo3List);
        listView.setAdapter(demo3Apdapter);
    }
}
