package com.example.task_10_audioplay;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnStart, btnPause, btnStop;
    MediaPlayer mediaPlayer;
    int length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStart = findViewById(R.id.btnStart);
        btnPause = findViewById(R.id.btnPause);
        btnStop = findViewById(R.id.btnStop);
        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.song);
        btnStart.setOnClickListener(this);
        btnPause.setOnClickListener(this);
        btnStop.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnStart:
                mediaPlayer.start();
                break;
            case R.id.btnPause:
                mediaPlayer.pause();
                break;
            case R.id.btnStop:
                mediaPlayer.stop();
                break;

        }
    }
}