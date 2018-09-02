package com.example.nemo1.gui;

import android.view.View;
import android.widget.EditText;

public class bai2_ExplicitsEvent implements View.OnClickListener, View.OnLongClickListener{
    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnTinhToan){
            //Add();
        }
        if(view.getId() == R.id.btnThoat){

        }
    }

    public int Add(EditText A, EditText B) {
        String soA = A.getText().toString();
        String soB = B.getText().toString();
        int result = Integer.valueOf(soA)+Integer.valueOf(soB);
        return result;
    }

    @Override
    public boolean onLongClick(View view) {
        return false;
    }
}
