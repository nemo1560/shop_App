package com.example.nemo1.navigation_bottom;

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

public class fragment_viewpger_3 extends Fragment implements View.OnClickListener {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_viewpager,container,false);
        return view;
    }

    private ImageView imageView;
    private TextView skip;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        imageView = view.findViewById(R.id.viewpager_img);
        skip = view.findViewById(R.id.skip);
        createImg();
        initEvent();
    }

    public void initEvent(){
        skip.setOnClickListener(this);
    }

    public void createImg(){
        imageView.setImageResource(R.mipmap.c);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getActivity(),navigation_activity.class);
        getActivity().startActivity(intent);
    }

}
