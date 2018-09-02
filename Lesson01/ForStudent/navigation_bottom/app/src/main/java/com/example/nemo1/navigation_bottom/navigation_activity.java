package com.example.nemo1.navigation_bottom;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class navigation_activity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{
    private ActionBar actionBar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_layout);
        actionBar = getSupportActionBar();
        actionBar.setTitle("Home");
        createFragment(new fragment_home(),"home");
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    private void createFragment(fragment_home fragment_home, String home) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container,fragment_home);
        fragmentTransaction.remove(new fragment_home());
        fragmentTransaction.commit();
        Bundle bundle = new Bundle();
        bundle.putString("text",home);
        fragment_home.setArguments(bundle);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        fragment_home fragment;
        fragment_home fragment_home = new fragment_home();
        switch (item.getItemId()){
            case R.id.home:
                //set title
                actionBar.setTitle("Home");
                fragment = new fragment_home();
                createFragment(fragment,"home");
                return true;
            case R.id.main1:
                actionBar.setTitle("Main 1");
                fragment = new fragment_home();
                createFragment(fragment,"main 1");
                return true;
            case R.id.main2:
                actionBar.setTitle("Main 2");
                fragment = new fragment_home();
                createFragment(fragment, "main 2");
                return true;
            case R.id.about:
                actionBar.setTitle("About");
                fragment = new fragment_home();
                createFragment(fragment,"about");
                return true;
        }
        return false;
    }
}
