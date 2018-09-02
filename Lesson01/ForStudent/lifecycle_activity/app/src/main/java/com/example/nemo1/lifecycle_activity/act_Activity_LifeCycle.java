package com.example.nemo1.lifecycle_activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class act_Activity_LifeCycle extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        initControl();
    }

    private Button btnA, btnB;

    public void initControl(){
        this.btnA = findViewById(R.id.btnA);
        this.btnB = findViewById(R.id.btnB);
        initEvent();
    }

    public void initEvent(){
        btnA.setOnClickListener(this);
        btnB.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnA){
            Intent intent = new Intent(act_Activity_LifeCycle.this,act_Activity_New.class);
            startActivity(intent);
        }

        if(view.getId() == R.id.btnB){
            Intent intent = new Intent(act_Activity_LifeCycle.this,act_Activity_Dialog.class);
            startActivity(intent);
        }
    }

    @Override
    protected void onStart() {
        Log.d("onStart","This is onStart");
        Toast.makeText(this, "This is onStart", Toast.LENGTH_SHORT).show();
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.d("onStop","This is onStop");
        Toast.makeText(this, "This is onStop", Toast.LENGTH_SHORT).show();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("onDestroy","This is onDestroy");
        try {
            TimeUnit.SECONDS.sleep(1);
            Toast.makeText(this, "This is onDestroy", Toast.LENGTH_SHORT).show();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.d("onPause","This is onPause");
        Toast.makeText(this, "This is onPause", Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.d("onResume","This is onResume");
        Toast.makeText(this, "This is onResume", Toast.LENGTH_SHORT).show();
        super.onResume();
    }
}
