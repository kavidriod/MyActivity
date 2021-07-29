package com.androidninja.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.androidninja.myactivity.launchmode.Activity_A;
import com.androidninja.myactivity.launchmode.LaunchModeActivity;

public class MainActivity extends AppCompatActivity {


    private static final String DEBUG = MainActivity.class.getSimpleName() ;
    Button lifecycle,launchmode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(DEBUG,"Build.VERSION.SDK_INT "+ Build.VERSION.SDK_INT);

        lifecycle = findViewById(R.id.lifecycle);
        launchmode = findViewById(R.id.launchmode);

        lifecycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),LifeCycleActivity.class));
            }
        });

        launchmode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Activity_A.class));
            }
        });
    }
}