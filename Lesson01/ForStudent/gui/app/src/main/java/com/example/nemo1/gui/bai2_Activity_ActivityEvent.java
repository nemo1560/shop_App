package com.example.nemo1.gui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class bai2_Activity_ActivityEvent extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai2);
        initWidget();
    }

    private Button btnTinhToan,btnThoat;
    private EditText txtSoA,txtSoB;
    private View.OnClickListener click;

    private void initWidget(){
        this.btnTinhToan = findViewById(R.id.btnTinhToan);
        this.btnThoat = findViewById(R.id.btnThoat);
        this.txtSoA = findViewById(R.id.editText_1);
        this.txtSoB = findViewById(R.id.editText_2);
        initEvent();
    }

    private void initEvent(){
        btnTinhToan.setOnClickListener(this);
        btnThoat.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnTinhToan){
            int soA = Integer.valueOf(txtSoA.getText().toString());
            int soB = Integer.valueOf(txtSoB.getText().toString());
            String result = String.valueOf(soA+soB);
            Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
        }
        else if(view.getId() == R.id.btnThoat){
            finish();
            System.exit(0);
        }
    }
}
