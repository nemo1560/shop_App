package com.example.nemo1.lifecycle_activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class act_demo_cycle_layout_wellcome extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo_cycle_layout_wellcome);
    }

    @Override
    protected void onStart() {
        Toast.makeText(this, "Wellcome", Toast.LENGTH_SHORT).show();
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        setObject();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
        super.onResume();
    }

    private TextView wellcome;

    public void setObject(){
        this.wellcome = findViewById(R.id.wellcome);
        setEvent();
    }

    public void setEvent(){
        wellcome.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        wellcome();
    }

    public void wellcome(){
        Intent intent = new Intent(act_demo_cycle_layout_wellcome.this,act_demo_cycle_layout_main.class);
        startActivity(intent);
        Toast.makeText(this, "Click", Toast.LENGTH_SHORT).show();
    }
}
