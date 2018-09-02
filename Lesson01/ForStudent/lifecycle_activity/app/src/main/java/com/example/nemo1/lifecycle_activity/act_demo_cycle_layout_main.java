package com.example.nemo1.lifecycle_activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.nemo1.lifecycle_activity.Model.setAdapter;
import com.example.nemo1.lifecycle_activity.Model.sourceSong;
import com.example.nemo1.lifecycle_activity.entity.songs;

import java.util.ArrayList;
import java.util.List;

public class act_demo_cycle_layout_main extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo_cycle_layout_main);
        initEvent();
    }

    private Button btnShow;
    private ListView list;
    private setAdapter setAdapter;
    private List<songs> arraylist;

    public void initEvent(){
        this.btnShow = findViewById(R.id.btnShow);
        this.list = findViewById(R.id.list);
        setEvent();
    }

    public void setEvent(){
        btnShow.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        setAdapter();
    }

    public void setAdapter(){
        arraylist = new sourceSong().songsList();
        setAdapter = new setAdapter(act_demo_cycle_layout_main.this,R.layout.rebel_button_custom_view,arraylist);
        list.setAdapter(setAdapter);
    }
}
