package com.example.nemo1.gui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.nemo1.gui.Contrroller.cCalculator;
import com.example.nemo1.gui.Entity.eCalculator;
import com.example.nemo1.gui.Model.mCalculator;


public class bai2_Activity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai2);
        initWidget();
        addSpinners();
    }

    private Button btnTinhToan,btnThoat;
    private EditText txtSoA,txtSoB;
    private Spinner spinner;
    private ArrayAdapter spinnerArrayAdapter;

    private void initWidget(){
        this.btnTinhToan = findViewById(R.id.btnTinhToan);
        this.btnThoat = findViewById(R.id.btnThoat);
        this.txtSoA = findViewById(R.id.editText_1);
        this.txtSoB = findViewById(R.id.editText_2);
        this.spinner = findViewById(R.id.spinner);
        initEvent();
    }

    private void initEvent(){
        btnTinhToan.setOnClickListener(this);
        btnThoat.setOnClickListener(this);
        spinner.setOnItemSelectedListener(this);
    }

    eCalculator eCalculator = new eCalculator();

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnTinhToan){
           if(txtSoA.getText().toString().isEmpty()||txtSoB.getText().toString().isEmpty()){
               txtSoA.setText("");
               txtSoB.setText("");
           }
            else {
               eCalculator.setSoA(Double.valueOf(txtSoA.getText().toString()));
               eCalculator.setSoB(Double.valueOf(txtSoB.getText().toString()));
               eCalculator.setOption(spinner.getSelectedItem().toString());
               cCalculator cCalculator = new cCalculator();
               String result = String.valueOf(cCalculator.calculator_controller(eCalculator));

               Toast.makeText(this,result, Toast.LENGTH_SHORT).show();
            }
        }
        if(view.getId() == R.id.btnThoat){
            finish();
        }
        if(view.getId() == R.id.spinner){
            String selected = spinner.getSelectedItem().toString();
            Toast.makeText(this, selected, Toast.LENGTH_SHORT).show();

        }
    }

    private void addSpinners(){
        //add mảng spinnerData vào object spinnerArrayAdapter
        this.spinnerArrayAdapter = ArrayAdapter.createFromResource(this,R.array.list_option,android.R.layout.simple_spinner_dropdown_item);
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerArrayAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, spinner.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
