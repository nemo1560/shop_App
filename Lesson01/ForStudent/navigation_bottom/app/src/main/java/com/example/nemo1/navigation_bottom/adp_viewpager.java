package com.example.nemo1.navigation_bottom;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class adp_viewpager extends FragmentStatePagerAdapter {
    public adp_viewpager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;
        switch (i){
            case 0:
                fragment = new fragment_viewpger_1();
                break;
            case 1:
                fragment = new fragment_viewpger_2();
                break;
            case 2:
                fragment = new fragment_viewpger_3();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

}
