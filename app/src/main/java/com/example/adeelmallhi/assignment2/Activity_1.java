package com.example.adeelmallhi.assignment2;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        Log.v("LifeCycle","OnCreate Fire");

        Toast.makeText(Activity_1.this, "Welcome", Toast.LENGTH_SHORT).show();

        Button bt;
        bt=(Button)findViewById(R.id.b1);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Activity_1.this,Activity_2.class);

                startActivity(i);


            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.v("LifeCycle","OnCreate Fire");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("LifeCycle","OnResume Fire");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("LifeCycle","OnPause Fire");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("LifeCycle","OnStop Fire");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("LifeCycle","OnRestart Fire");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("LifeCycle","OnDestroy Fire");
    }
}
