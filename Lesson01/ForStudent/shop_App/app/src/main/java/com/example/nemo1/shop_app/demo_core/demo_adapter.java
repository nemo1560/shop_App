package com.example.nemo1.shop_app.demo_core;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class demo_adapter extends FragmentStatePagerAdapter {
    public demo_adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new demo_fragment_1();
                break;
            case 1:
                fragment = new demo_fragment_2();
                break;
            case 2:
                fragment = new demo_fragment_3();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
