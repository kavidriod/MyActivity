package com.androidninja.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class LifeCycleActivity extends AppCompatActivity {

    private static final String TAG = LifeCycleActivity.class.getSimpleName();

    // EditText editTextSampleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Log.i(TAG,"  onCreate");
        //finish();

        //editTextSampleText = findViewById(R.id.editTextSampleText);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG," onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG," onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG," onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG," onPause");
    }



    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG," onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG," onDestroy");
    }

/*
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG,"in method onSaveInstanceState");
        outState.putString("samplekey",editTextSampleText.getText().toString());
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG,"in method onRestoreInstanceState");
        editTextSampleText.setText(savedInstanceState.getString("samplekey"));
    }*/
}