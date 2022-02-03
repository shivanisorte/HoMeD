package com.shivani.homed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class IntroActivity extends AppCompatActivity {

    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        lottieAnimationView = findViewById(R.id.lottie);
        lottieAnimationView.animate().translationY(1600).setDuration(1000).setStartDelay(2000);


    }
}