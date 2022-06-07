package com.gmail.myapplication;

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
    Sensor sensor = accelerometer;

    int jump_up = 0;
    int jump_down = 0;

    float x,y,z;

    final int jumpThreshold = 4; // 점프 임계값

    double gravity = 9.81;
    double acceleration = 0;
    JumpGame mJumpGame;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 화면을 가로로 설정하기
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.jump);

        mJumpGame = findViewById(R.id.mJumpGame);
        sm = (SensorManager) getSystemService(SENSOR_SERVICE);

        sensor_accelerometer = sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK){
            finish();
            return false;
        }
        return false;
    }
}