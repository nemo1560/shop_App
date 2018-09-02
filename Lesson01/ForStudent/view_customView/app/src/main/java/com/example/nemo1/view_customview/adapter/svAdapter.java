package com.example.nemo1.view_customview.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import com.example.nemo1.view_customview.R;
import com.example.nemo1.view_customview.entity.sv;

import java.util.List;

public class svAdapter extends ArrayAdapter<sv>{
    private Activity activity;
    private int resource;
    private List<sv> svList;

    public svAdapter(Activity activity, int resource, List<sv> svList) {
        super(activity, resource, svList);
        this.activity = activity;
        this.resource = resource;
        this.svList = svList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            //1. Su dung de building layout thanh ma lenh java da su dung trong viec bind du lieu vao no.
            //do lop custom ko phai lop activity nen phai dung layoutInflater bien dich lai.
            LayoutInflater layoutInflater = this.activity.getLayoutInflater();

            //2.Lay ra 1 view tu doi tuong layoutInflater
            View view = layoutInflater.inflate(this.resource, parent, false);

            //3.Khai bao va khoi tao cac thanh phan tren 1 view mau.
            EditText name = view.findViewById(R.id.editTen);
            EditText email = view.findViewById(R.id.editEmail);
            EditText diem = view.findViewById(R.id.editDiem);

            //4.lay ra du lieu da duoc do vao de bind vao item mau
            sv sv = this.svList.get(position);

            //5.Bindding lan luot ca thong tin tu doi tuong len view de show
            name.setText(sv.getName());
            email.setText(sv.getEmail());
            diem.setText(String.valueOf(sv.getDiem()));
            return view;
    }
}