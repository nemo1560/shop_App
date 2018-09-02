package com.example.nemo1.cardview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.nemo1.cardview.adapter.adpDemo3;
import com.example.nemo1.cardview.controller.cDemo3;
import com.example.nemo1.cardview.entity.eDemo3;

import java.util.List;

public class actDemo3 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_layout);
    }

    private RecyclerView recyclerView;
    private adpDemo3 adpDemo3;
    private List<eDemo3>eDemo3List;

    @Override
    protected void onStart() {
        super.onStart();
        recyclerView = findViewById(R.id.recyclerView);
        createAdapter();
    }

    public void createAdapter(){
        eDemo3List = new cDemo3().geteDemo3List();
        adpDemo3 = new adpDemo3(eDemo3List,this);
        recyclerView.setAdapter(adpDemo3);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}
