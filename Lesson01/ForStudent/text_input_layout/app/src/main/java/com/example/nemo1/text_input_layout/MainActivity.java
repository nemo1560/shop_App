package com.example.nemo1.text_input_layout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.nemo1.text_input_layout.controller.cLogin;
import com.example.nemo1.text_input_layout.entity.eLogin;
import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Pattern;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_input_layout);
        initWidget();
    }

    private EditText txtName,txtEmail,txtPass;
    private Button btnOk, btnThoat;
    private eLogin eLogin;
    private cLogin cLogin;
    private TextInputLayout layout_name,layout_email,layout_pass;

    private void initWidget(){
        this.layout_name = findViewById(R.id.layout_name);
        this.layout_email = findViewById(R.id.layout_email);
        this.layout_pass = findViewById(R.id.layout_pass);
        this.txtName = findViewById(R.id.txtName);
        this.txtEmail = findViewById(R.id.txtEmail);
        this.txtPass = findViewById(R.id.txtPass);
        this.btnOk = findViewById(R.id.btnOk);
        this.btnThoat = findViewById(R.id.btnThoat);
        initEvent();
    }

    private void initEvent(){
        this.btnOk.setOnClickListener(this);
        this.btnThoat.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnOk){
            eLogin = new eLogin(txtName.getText().toString(),txtEmail.getText().toString(),Integer.valueOf(txtPass.getText().toString()));
            Toast.makeText(this, eLogin.getEmail(), Toast.LENGTH_SHORT).show();
            cLogin = new cLogin();
            if(cLogin.cLogin(eLogin)){
                Toast.makeText(this, "True", Toast.LENGTH_SHORT).show();
                layout_email.setErrorEnabled(false);
            }
            else {
                Toast.makeText(this, "False", Toast.LENGTH_SHORT).show();
                layout_email.setError("Enter valid email address");
            }
        }
        if(view.getId() == R.id.btnThoat){
            finish();
        }
    }
}
