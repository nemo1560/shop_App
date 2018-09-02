package com.example.nemo1.gui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai2);

    }

    // cach add event 1
    public void onCalculator(View view) {
        Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT).show();
    }


    // cach add event 2
    //1. Khai bao bien kieu button object.
    //2. Tao function <ten>
    //3. set Event cho object

    private Button btn;

    private void EventInt() {
        btn = findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Demo Widget", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void ShowWidget() {
        btn = findViewById(R.id.btn1);
    }
}

