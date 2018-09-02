package com.example.nemo1.lifecycle_activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("onCreated","This is onCreated");
        Toast.makeText(this, "onCreated", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        Log.d("onStart","This is onStart");
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
        super.onStart();
    }

    @Override
    protected void onPause() {
        Log.d("onPause","This is onPause");
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.d("onResume","This is onResume");
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
        super.onResume();
    }

    @Override
    protected void onStop() {
        Log.d("onStop","This is onStop");
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("onDestroy","This is onDestroy");
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

}
