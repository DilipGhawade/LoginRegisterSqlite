package com.meteorsoftech.loginregistersqlite;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.meteorsoftech.loginregistersqlite.activities.LoginActivity;

public class MainActivity extends AppCompatActivity {
    private static int Splash_Time_Out=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(i);
                finish();

            }
        },Splash_Time_Out);

    }
}
