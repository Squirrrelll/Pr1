package com.example.pr1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.TokenWatcher;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Pr1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "onCreate", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "Error in onCreate");
        Log.w(TAG, "Warning in onCreate");
        Log.i(TAG, "Info in onCreate");
        Log.d(TAG, "Debug in onCreate");
        Log.v(TAG, "Verbose in onCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "Error in onStart");
        Log.w(TAG, "Warning in onStart");
        Log.i(TAG, "Info in onStart");
        Log.d(TAG, "Debug in onStart");
        Log.v(TAG, "Verbose in onStart");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "onStop", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "Error in onStop");
        Log.w(TAG, "Warning in onStop");
        Log.i(TAG, "Info in onStop");
        Log.d(TAG, "Debug in onStop");
        Log.v(TAG, "Verbose in onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "onDestroy", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "Error in onDestroy");
        Log.w(TAG, "Warning in onDestroy");
        Log.i(TAG, "Info in onDestroy");
        Log.d(TAG, "Debug in onDestroy");
        Log.v(TAG, "Verbose in onDestroy");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "onPause", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "Error in onPause");
        Log.w(TAG, "Warning in onPause");
        Log.i(TAG, "Info in onPause");
        Log.d(TAG, "Debug in onPause");
        Log.v(TAG, "Verbose in onPause");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "onResume", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "Error in onResume");
        Log.w(TAG, "Warning in onResume");
        Log.i(TAG, "Info in onResume");
        Log.d(TAG, "Debug in onResume");
        Log.v(TAG, "Verbose in onResume");
    }
}
