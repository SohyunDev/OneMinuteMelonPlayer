package com.example.sohyun_mac.oneminutemelonplayer;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

public class IntroActivity extends AppCompatActivity {

    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_intro);
        handler = new Handler();
        handler.postDelayed(run, 3000);
    }

    Runnable run = new Runnable() {
        @Override
        public void run() {
            Intent mainIntent = new Intent(IntroActivity.this, MainActivity.class);
            startActivity(mainIntent);
            finish();
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        }
    };

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        handler.removeCallbacks(run);
    }

}
