package com.example.nemo1.gui;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.nemo1.gui.Contrroller.cCheckRegistraton;
import com.example.nemo1.gui.Entity.eRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bai3_Activity extends AppCompatActivity implements View.OnClickListener,AdapterView.OnItemSelectedListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai3);
        initWidget();
        setDataSpinner();
    }
    /*
    * Tao cac doi tuong
    * */
    private Button btnDangNhap,btnThoat;
    private EditText txtName,txtAge;
    private Spinner spiTTHN,spiGioiTinh;
    private ArrayAdapter arrayAdapter, arrayAdapter_2;
    private eRegistration eRegistration;
    private cCheckRegistraton cCheckRegistraton;
    private AlertDialog.Builder builder;

    //Gan cac doi tuong voi R.id cua cac component trong layout
    public void initWidget(){
        this.btnDangNhap = findViewById(R.id.btnDangNhap);
        this.btnThoat = findViewById(R.id.btnThoat);
        this.txtName = findViewById(R.id.txtName);
        this.txtAge = findViewById(R.id.txtAge);
        this.spiTTHN = findViewById(R.id.spiTTHN);
        this.spiGioiTinh = findViewById(R.id.spiGioiTinh);
        this.eRegistration = new eRegistration();
        this.cCheckRegistraton = new cCheckRegistraton();
        initEvent();
    }

    //Gan cac event
    public void initEvent(){
        btnDangNhap.setOnClickListener(this);
        btnThoat.setOnClickListener(this);
        spiGioiTinh.setOnItemSelectedListener(this);
        spiTTHN.setOnItemSelectedListener(this);
    }

    //Gan data vao spinner
    public void setDataSpinner(){
        this.arrayAdapter = ArrayAdapter.createFromResource(this,R.array.list_marital_status,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiTTHN.setAdapter(arrayAdapter);

        this.arrayAdapter_2 = ArrayAdapter.createFromResource(this,R.array.list_sex,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapter_2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiGioiTinh.setAdapter(arrayAdapter_2);
    }

    //Xu ly su kien trong Button
    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnDangNhap){
            String name = txtName.getText().toString();
            String age = txtAge.getText().toString();
            //Kiem tra editText nhap vao
            Matcher matcher = Pattern.compile("^([1-9][0-9]{0,2})?(\\.[0-9]?)?$").matcher(age);
            if(name.isEmpty()){
                Toast.makeText(this, "Please input your name", Toast.LENGTH_SHORT).show();
                txtName.setText("");
            }
            else {
                if(!matcher.find()||age.isEmpty()){
                    Toast.makeText(this, "Please input your age", Toast.LENGTH_SHORT).show();
                    txtAge.setText("");
                }
                else {
                    eRegistration.setName_Res(name);
                    eRegistration.setAge_Res(Integer.valueOf(age));
                    eRegistration.setSex_Res(spiGioiTinh.getSelectedItem().toString());
                    eRegistration.setStatus_Res(spiTTHN.getSelectedItem().toString());
                    boolean result = cCheckRegistraton.checkRegistraton_controller(eRegistration);

                    //Widget ket qua kiem tra cac dieu kien
                    if(result){
                        this.builder  = new AlertDialog.Builder(this);
                        builder.setTitle("Congratulation");
                        builder.setMessage("Hi! you have hacked");
                        builder.setNegativeButton("Help", null);
                        builder.create().show();
                    }
                    else {
                        this.builder = new AlertDialog.Builder(this);
                        builder.setTitle("Oh Oh");
                        builder.setMessage("God see you");
                        builder.setNegativeButton("OK", null);
                        builder.create().show();
                    }
                }
            }
        }
        if(view.getId() == R.id.btnThoat){
            finish();
        }

    }
    //Xu ly su kien cua spinner
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        //Toast.makeText(this, "Status: "+spiTTHN.getSelectedItem().toString()+ ", "+spiGioiTinh.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
