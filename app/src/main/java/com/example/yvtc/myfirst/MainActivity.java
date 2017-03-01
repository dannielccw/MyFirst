package com.example.yvtc.myfirst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("dan.w: LEARN", "onCreate()");
        //test message
    }

    public void click1(View v)
    {
        Intent it = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(it);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("dan.w: LEARN", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("dan.w: LEARN", "onResume()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("dan.w: LEARN", "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("dan.w: LEARN", "onDestroy()");
    }
}
