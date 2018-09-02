package com.example.nemo1.cardview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.example.nemo1.cardview.adapter.adpCar;
import com.example.nemo1.cardview.controller.cCAR;
import com.example.nemo1.cardview.entity.eCar;

import java.util.List;

public class act_car extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_recycler_view);
    }

    private List<eCar> eCarList;
    private adpCar adpCar;
    private RecyclerView recyclerView;

    @Override
    protected void onStart() {
        super.onStart();
        recyclerView = findViewById(R.id.nemuCar);
        createAdapter();
    }

    public void createAdapter(){
        eCarList = new cCAR().geteCarList();
        adpCar = new adpCar(eCarList,this);
        recyclerView.setAdapter(adpCar);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}
