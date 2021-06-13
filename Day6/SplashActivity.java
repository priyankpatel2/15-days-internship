package com.example.day_6task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.WindowManager;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash);


        Thread thread = new Thread(){
            public void run(){
                try{
                    try {
                        sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                finally {
                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        thread.start();
    }

    private void requestWindowFeature(int flagFullscreen, int flagFullscreen1) {
    }

    @Override
    protected void onPause(){
        super.onPause();
        finish();
    }
}