package com.example.nemo1.cardview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.nemo1.cardview.adapter.adpDemo5;
import com.example.nemo1.cardview.controller.cDemo5;
import com.example.nemo1.cardview.entity.eDemo5;

import java.util.List;

public class actDemo5 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_layout);
    }

    private List<eDemo5> eDemo5List;
    private adpDemo5 adpDemo5;
    private RecyclerView recyclerView;

    @Override
    protected void onStart() {
        super.onStart();
        recyclerView = findViewById(R.id.recyclerView);
        setAdapter();
    }

    public void setAdapter(){
        eDemo5List = new cDemo5().geteDemo5List();
        adpDemo5 = new adpDemo5(this,eDemo5List);
        recyclerView.setAdapter(adpDemo5);

        //RecyclerView scroll vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}
