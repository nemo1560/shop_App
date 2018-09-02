package com.example.nemo1.gui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.nemo1.gui.Contrroller.cGetInfoStudent;
import com.example.nemo1.gui.Entity.eGetInfoStudent;

public class bai4_Activity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai4);
        initEvent();
    }

    private Button btnThem,btnThoat;
    private EditText txtMaSV,txtTen,txtNgaySinh,txtDienThoai,txtEmail,txtCMND;
    private RadioGroup chkGroup; //Su dung khi dung radioButton.
    private RadioButton chkBoxNam,chkBoxNu;
    private eGetInfoStudent eGetInfoStudent;
    private cGetInfoStudent cGetInfoStudent;

    public void initEvent(){
        this.btnThem = findViewById(R.id.btnThem);
        this.btnThoat = findViewById(R.id.btnThoat);
        this.txtMaSV = findViewById(R.id.txtMaSV);
        this.txtTen = findViewById(R.id.txtTen);
        this.txtNgaySinh = findViewById(R.id.txtNgaySinh);
        this.txtDienThoai = findViewById(R.id.txtDienThoai);
        this.txtCMND = findViewById(R.id.txtCMND);
        this.txtEmail = findViewById(R.id.txtEmail);
        this.chkGroup = findViewById(R.id.chkGroup);
        this.chkBoxNam = findViewById(R.id.chkBoxNam);
        this.chkBoxNu = findViewById(R.id.chkBoxNu);
        initAddEvent();
    }

    public void initAddEvent(){
        btnThoat.setOnClickListener(this);
        btnThem.setOnClickListener(this);
        chkBoxNam.setOnClickListener(this);
        chkBoxNu.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        eGetInfoStudent = new eGetInfoStudent();
        cGetInfoStudent = new cGetInfoStudent();
        //Lay id cua RadioButton da check
        if(view.getId() == R.id.chkBoxNam ){
            Toast.makeText(this, "Nam", Toast.LENGTH_SHORT).show();
            eGetInfoStudent.setGioitinhSV("Nam");

        }
        if(view.getId() == R.id.chkBoxNu){
            Toast.makeText(this, "Nu", Toast.LENGTH_SHORT).show();
            eGetInfoStudent.setGioitinhSV("Nữ");
        }

        if(view.getId() == R.id.btnThem){
            eGetInfoStudent.setMaSV(txtMaSV.getText().toString());
            eGetInfoStudent.setTenSV(txtTen.getText().toString());
            eGetInfoStudent.setNgaysinhSV(txtNgaySinh.getText().toString());
            eGetInfoStudent.setDtSV(Integer.valueOf(txtDienThoai.getText().toString()));
            eGetInfoStudent.setEmailSV(txtEmail.getText().toString());
            eGetInfoStudent.setSoCMNDSV(Integer.valueOf(txtCMND.getText().toString()));

            String show = cGetInfoStudent.getInfoStudent_controller(eGetInfoStudent);

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Thông tin sinh viên");
            builder.setMessage(show);
            builder.setNegativeButton("Ok",null);
            builder.create().show();
        }

        if(view.getId() == R.id.btnThoat){
            finish();
        }

    }

}
