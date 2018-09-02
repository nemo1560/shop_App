package com.example.nemo1.lightflash;

import android.Manifest;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private ImageView on;
    private CameraManager cam;
    private static final int CAMERA_REQUEST = 50;
    private boolean flash;
    private boolean flashon = false;

    @Override
    protected void onStart() {
        super.onStart();
        on = findViewById(R.id.on);
        initEvent();
    }

    public void initEvent(){
        on.setOnClickListener(this);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onClick(View v) {
        /*
         * Kiểm tra thiết bị có hỗ trợ flash camera không ?
         */
        flash = getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH);

        if(!flash){
            //Nếu không hỗ trợ
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
            alertDialog.setTitle("Error");
            alertDialog.setMessage("This device not support");
            alertDialog.setNegativeButton("OK",null);
        }
        //Hỗ trợ
        else {
            if(!flashon){
                turnonFlash();
            }
            else {
                turnoffFlash();
            }
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void turnonFlash(){
        cam = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
        try {
            String camId = cam.getCameraIdList()[0];
            cam.setTorchMode(camId,true);
            flashon = true;
            on.setImageResource(R.mipmap.off);
            Toast.makeText(MainActivity.this,"Turn On",Toast.LENGTH_SHORT).show();
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public  void turnoffFlash(){
        cam = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
        try {
            String camId = cam.getCameraIdList()[0];
            cam.setTorchMode(camId,false);
            flashon = false;
            on.setImageResource(R.mipmap.on);
            Toast.makeText(MainActivity.this,"Turn Off",Toast.LENGTH_SHORT).show();
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case CAMERA_REQUEST:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(MainActivity.this, "OK", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, " not OK", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
