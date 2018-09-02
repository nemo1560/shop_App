package com.example.nemo1.cardview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.nemo1.cardview.R;
import com.example.nemo1.cardview.adapter.adpDemo2;
import com.example.nemo1.cardview.controller.cDemo2;
import com.example.nemo1.cardview.entity.eDemo2;

import java.util.List;

public class actDemo2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_layout);
    }

    private List<eDemo2>eDemo2List;
    private com.example.nemo1.cardview.adapter.adpDemo2 adpDemo2;
    private RecyclerView recyclerView;

    @Override
    protected void onStart() {
        super.onStart();
        recyclerView = findViewById(R.id.recyclerView);
        createAdapter();
    }

    public void createAdapter(){
        eDemo2List = new cDemo2().geteDemo2List();
        adpDemo2 = new adpDemo2(eDemo2List,this);
        recyclerView.setAdapter(adpDemo2);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}
