package com.gmail.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.appCompatActivity;
import android.view.KeyEvent;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements SensorEventListener{

    SonsorManager sm;
    Sensor sensor _ accelerometer;

    int jump _ up = 0;
    int jump _ down = 0;

    float x,y,z;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}