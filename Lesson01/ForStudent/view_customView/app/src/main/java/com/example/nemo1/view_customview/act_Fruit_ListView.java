package com.example.nemo1.view_customview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.nemo1.view_customview.adapter.fruitAdapter;
import com.example.nemo1.view_customview.controller.cFruit;
import com.example.nemo1.view_customview.entity.eFruit;

import java.util.List;

public class act_Fruit_ListView extends AppCompatActivity implements AdapterView.OnItemClickListener{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lt_listview_custom);
        initButton();
    }

    private ListView listView;
    private fruitAdapter fruitAdapter;
    private List<eFruit> fruits;

    public void initButton(){
        this.listView = findViewById(R.id.list_item);
        initEvent();
    }

    public void initEvent(){
        listView.setOnItemClickListener(this);
        setAdapter();
    }

    public void setAdapter(){
        fruits = new cFruit().getList();
        fruitAdapter = new fruitAdapter(act_Fruit_ListView.this,R.layout.lt_fruit,fruits);
        listView.setAdapter(fruitAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, fruits.get(position).getName(), Toast.LENGTH_SHORT).show();
    }
}
