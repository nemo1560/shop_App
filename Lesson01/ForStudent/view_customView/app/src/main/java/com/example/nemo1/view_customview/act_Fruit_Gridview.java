package com.example.nemo1.view_customview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import com.example.nemo1.view_customview.adapter.grid_fruitAdapter;
import com.example.nemo1.view_customview.controller.cGrid_Fruit;
import com.example.nemo1.view_customview.entity.eFruit;

import java.util.List;

public class act_Fruit_Gridview extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview_custom_2line);
        initEvent();
    }
    private GridView gridView;
    private grid_fruitAdapter grid_fruitAdapter;
    private List<eFruit> eFruitList;

    public void initEvent(){
        gridView = findViewById(R.id.friut_group);
        setAdapter();
    }

    public void setAdapter(){
        eFruitList = new cGrid_Fruit().geteFruitList();
        grid_fruitAdapter = new grid_fruitAdapter(act_Fruit_Gridview.this,R.layout.grid_fruit,eFruitList);
        gridView.setAdapter(grid_fruitAdapter);
    }
}
