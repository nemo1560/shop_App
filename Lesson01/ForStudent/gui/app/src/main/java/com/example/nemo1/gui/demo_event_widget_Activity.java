package com.example.nemo1.gui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class demo_event_widget_Activity extends AppCompatActivity{
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo_event_widget);
        initControl();
    }

    /*
     * code cua demo_event_widget layout
     * */

    private Button btn1;
    private Button btn2;
    private View.OnClickListener onDoSomeThing = null;

    private void initControl(){
        this.btn1 = findViewById(R.id.btn1);
        this.btn2 = findViewById(R.id.btn2);
        initEvent();
    }

    private void initEvent(){
        this.onDoSomeThing = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId() == R.id.btn1){
                    Toast.makeText(demo_event_widget_Activity.this, "Button 1", Toast.LENGTH_SHORT).show();
                }
                else if(view.getId() == R.id.btn2){
                    Toast.makeText(demo_event_widget_Activity.this, "Button 2", Toast.LENGTH_SHORT).show();
                }
            }
        };
        btn1.setOnClickListener(onDoSomeThing);
        btn2.setOnClickListener(onDoSomeThing);
    }
}
