package com.example.nemo1.gui;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class bai2_Activity_ExplicitActivity extends AppCompatActivity{
    private Button btnTinhToan,btnThoat;
    private EditText txtSoA,txtSoB;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai2);
        initWidget();
    }

    private void initWidget(){
        this.btnTinhToan = findViewById(R.id.btnTinhToan);
        this.btnThoat = findViewById(R.id.btnThoat);
        this.txtSoA = findViewById(R.id.editText_1);
        this.txtSoB = findViewById(R.id.editText_2);
        initEvent();
    }

    private void initEvent(){
        btnTinhToan.setOnClickListener(new bai2_ExplicitsEvent());
        btnThoat.setOnClickListener(new bai2_ExplicitsEvent());
        new bai2_ExplicitsEvent().Add(txtSoA, txtSoB);
    }
}
