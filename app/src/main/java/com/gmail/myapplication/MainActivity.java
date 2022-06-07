package com.gmail.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.appCompatActivity;
import android.view.KeyEvent;

import android.os.Bundle;

public class MainActivity extends appCompatActivity implements SensorEventListener{

    SonsorManager sm;
    Sensor sensor _ accelerometer;

    int jump _ up = 0;
    int jump _ down = 0;

    float x,y,z;

    final int jumpThreshold = 4; // 점프 임계값

    double gravity = 9.81;
    double acceleration = 0;
    JumpGame mJumpGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 화면을 가로로 설정하기
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.jump);
    }
}