package com.example.nemo1.shop_app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.nemo1.shop_app.demo_core.demo_adapter;

public class demo_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

    }

    private ViewPager viewPager;

    @Override
    protected void onStart() {
        super.onStart();
        setViewPager();
    }

    public void setViewPager(){
        viewPager = findViewById(R.id.fragment_demo_layout);
        FragmentManager fragmentManager = getSupportFragmentManager();
        demo_adapter demo_adapter = new demo_adapter(fragmentManager);
        viewPager.setAdapter(demo_adapter);
    }
}
