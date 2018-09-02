package com.example.nemo1.view_customview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class act_ListView_example extends AppCompatActivity implements View.OnClickListener,AdapterView.OnItemClickListener {
    private String[] arValue;
    private ArrayAdapter stringArrayAdapter;
    private Button button;
    ListView listView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lt_listview_sample);
        initControl();
    }

    public void initControl(){
        this.button = findViewById(R.id.btnfind);
        this.listView = findViewById(R.id.list_exp);
        initEvent();
    }

    public void initEvent(){
        button.setOnClickListener(this);
        listView.setOnItemClickListener(this);
    }

    public void setAdapter(){
        //Lay du lieu tu String resource.
        arValue = getResources().getStringArray(R.array.list_example);

        stringArrayAdapter = new ArrayAdapter<String>(act_ListView_example.this,android.R.layout.simple_list_item_1,arValue);

        listView.setAdapter(stringArrayAdapter);
    }

    @Override
    public void onClick(View view) {
        setAdapter();
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, "Ban dang chon vi tri: "+adapterView.getItemIdAtPosition(i), Toast.LENGTH_SHORT).show();

    }
}
