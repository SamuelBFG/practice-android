package com.example.android.musicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.atrasadinha);

        TextView buttonPlay = (TextView) findViewById(R.id.button_play);
        TextView buttonPause = (TextView) findViewById(R.id.button_pause);
        TextView buttonStop = (TextView) findViewById(R.id.button_stop);
        TextView timeStamp = (TextView) findViewById(R.id.time_stamp);

        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaPlayer.start();
            }
        });

        buttonPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();
            }
        });

        buttonStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.reset();
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.atrasadinha);
            }
        });

        timeStamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.seekTo(5000);
            }
        });
    }
}
