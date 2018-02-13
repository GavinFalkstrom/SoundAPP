package com.example.a599644.soundapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}


    public void sound (view view) {
        MediaPlayer hi = MediaPlayer.create(getApplicationContext(), R.raw.hi);
        hi.start();
    }

    public void activity2(View view) {
        Intent Activity_main2 = new Intent(this, Activity_main2.class);
        startActivity(Activity_main2);
    }
}
