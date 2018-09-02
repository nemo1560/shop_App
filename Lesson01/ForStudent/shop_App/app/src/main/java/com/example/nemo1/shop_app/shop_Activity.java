package com.example.nemo1.shop_app;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.nemo1.shop_app.shop_core.fragment_book;
import com.example.nemo1.shop_app.shop_core.fragment_film;
import com.example.nemo1.shop_app.shop_core.fragment_music;

public class shop_Activity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.navigation_music:
                    fragment = new fragment_music();
                    callFragment(fragment);
                    navigation.setBackgroundColor(getResources().getColor(R.color.music_navigation));
                    return true;
                case R.id.navigation_film:
                    fragment = new fragment_film();
                    callFragment(fragment);
                    navigation.setBackgroundColor(getResources().getColor(R.color.film_navigation));
                    return true;
                case R.id.navigation_album:
                    fragment = new fragment_book();
                    callFragment(fragment);
                    navigation.setBackgroundColor(getResources().getColor(R.color.album_navigation));
                    return true;
            }
            return false;
        }
    };

    public void callFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_shop_layout,fragment);
        fragmentTransaction.commit();
    }

    private BottomNavigationView navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_);
        navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        /*
        * auto call fragment_music when unselected navigation-bottom.
        * */
        callFragment(new fragment_music());
    }

}
