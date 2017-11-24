package com.example.sohyun_mac.oneminutemelonplayer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer = null;
    private final String musicText = "상어가족 재생중~~>_<";
    private TextView songTextView;
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        songTextView = (TextView)findViewById(R.id.songTextView);
        playing();
        songTextView.setText(musicText);
        handler = new Handler();
        handler.postDelayed(run, 60*1000);
    }

    private void playing(){
        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.sharksong);
        mediaPlayer.start();
    }

    Runnable run = new Runnable() {
        @Override
        public void run() {
            mediaPlayer.stop();
            Intent popUpIntent = new Intent(MainActivity.this, PopUpWindow.class);
            startActivity(popUpIntent);
        }
    };
}
