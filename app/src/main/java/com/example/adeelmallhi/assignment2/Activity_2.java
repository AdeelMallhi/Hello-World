package com.example.adeelmallhi.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class Activity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Log.v("LifeCycle2","OnCreate Fire");

        Toast.makeText(Activity_2.this,"Welcome2",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("LifeCycle2","OnCreate Fire");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("LifeCycle2","OnResume Fire");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("LifeCycle2","OnPause Fire");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("LifeCycle2","OnStop Fire");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("LifeCycle2","OnRestart Fire");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("LifeCycle2","OnDestroy Fire");
    }
}
