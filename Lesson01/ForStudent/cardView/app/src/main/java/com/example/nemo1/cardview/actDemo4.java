package com.example.nemo1.cardview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.nemo1.cardview.adapter.adpDemo4;
import com.example.nemo1.cardview.controller.cDemo4;
import com.example.nemo1.cardview.entity.eDemo4;

import java.util.List;

public class actDemo4 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_layout);
    }

    private RecyclerView recyclerView;
    private adpDemo4 adpDemo4;
    private List<eDemo4> eDemo4List;

    @Override
    protected void onStart() {
        super.onStart();
        recyclerView = findViewById(R.id.recyclerView);
        setAdapter();
    }

    public void setAdapter(){
        eDemo4List = new cDemo4().geteDemo4List();
        adpDemo4 = new adpDemo4(this,eDemo4List);
        recyclerView.setAdapter(adpDemo4);

        //RecyclerView scroll vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

    }
}
