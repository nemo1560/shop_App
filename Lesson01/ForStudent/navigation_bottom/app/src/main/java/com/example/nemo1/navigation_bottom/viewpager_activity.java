package com.example.nemo1.navigation_bottom;

import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static com.example.nemo1.navigation_bottom.R.*;

public class viewpager_activity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.viewpager_layout);
    }

    private ViewPager viewPager;

    @Override
    protected void onStart() {
        super.onStart();
        viewPager = findViewById(id.viewpager);
        addViewPagers();
    }

    public void addViewPagers(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        adp_viewpager adp_viewpager = new adp_viewpager(fragmentManager);
        viewPager.setAdapter(adp_viewpager);
    }

}
