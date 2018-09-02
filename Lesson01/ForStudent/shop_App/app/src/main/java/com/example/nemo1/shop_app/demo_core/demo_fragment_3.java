package com.example.nemo1.shop_app.demo_core;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nemo1.shop_app.R;
import com.example.nemo1.shop_app.shop_Activity;

public class demo_fragment_3 extends Fragment implements View.OnClickListener {
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_demo,container,false);
        return view;
    }

    private ImageView imageView;
    private TextView textView;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        imageView = view.findViewById(R.id.demo_img);
        textView = view.findViewById(R.id.skip);
        addImg();
        initEvent();
    }

    private void initEvent() {
        textView.setOnClickListener(this);
    }

    public void addImg(){
        imageView.setImageResource(R.mipmap.album);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getContext(), shop_Activity.class);
        getContext().startActivity(intent);
    }
}
