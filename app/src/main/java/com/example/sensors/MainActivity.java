package com.example.sensors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private SensorManager sensorManager;
    Sensor accelerometer;
    TextView xValue , yValue , zValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        xValue=(TextView)findViewById(R.id.xValue);
        yValue=(TextView)findViewById(R.id.yValue);
        zValue=(TextView)findViewById(R.id.zValue);
        Log.d("Main Activity", "Initializing  Sensor Services");
        sensorManager=(SensorManager)getSystemService(Context.SENSOR_SERVICE);
        accelerometer=sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sensorManager.registerListener((SensorEventListener) MainActivity.this,accelerometer,SensorManager.SENSOR_DELAY_NORMAL);
        Log.d("Main Activity", "Register acceloremeter listener");


    }
}