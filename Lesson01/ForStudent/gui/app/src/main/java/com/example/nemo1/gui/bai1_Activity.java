package com.example.nemo1.gui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.nemo1.gui.Contrroller.cBaseController;
import com.example.nemo1.gui.Contrroller.cCheckAccount;
import com.example.nemo1.gui.Entity.eAccount;

public class bai1_Activity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai1);
        initAction();
    }
    private Button btnDangNhap,btnThoat;
    private EditText user,pass;
    //private View.OnLongClickListener onLongClickListener;
    public void initAction(){
        this.btnDangNhap = findViewById(R.id.btnDangNhap);
        this.btnThoat = findViewById(R.id.btnThoat);
        this.user = findViewById(R.id.user);
        this.pass = findViewById(R.id.pass);
        xulydangnhap();
    }
    public void xulydangnhap(){
        btnThoat.setOnClickListener(this);
        btnDangNhap.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnDangNhap){
            String strUser = user.getText().toString();
            String strPass = pass.getText().toString();

            eAccount eAccount = new eAccount();
            eAccount.setPass(strPass);
            eAccount.setUser(strUser);

            cCheckAccount cCheckAccount = new cCheckAccount();
            if(cCheckAccount.checkAccount_controller(eAccount)){
                //tao Massage thông báo trên màn hình
                AlertDialog.Builder showMessageBuilder = new AlertDialog.Builder(this);
                showMessageBuilder.setTitle("Dang nhap");
                showMessageBuilder.setMessage("Ban co chac chan muon dang nhap");
                //Tạo các nút tùy chọn trong thông báo
                showMessageBuilder.setNegativeButton("Đồng ý", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(bai1_Activity.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                    }
                });

                showMessageBuilder.setNegativeButton("Không đồng ý", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                //Tao object AlertDialog de show object AlertDialog.Builder.
                AlertDialog show = showMessageBuilder.show();
            }
            else{
                user.setText("");
                pass.setText("");
                Toast.makeText(this, "Vui long nhap lai mat khau", Toast.LENGTH_SHORT).show();
            }
        }
        if(view.getId() == R.id.btnThoat){
            finish();
            System.exit(0);
        }
    }
}
