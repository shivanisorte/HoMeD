package com.shivani.homed;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

import org.jetbrains.annotations.NotNull;

public class IntroActivity extends AppCompatActivity {

    private static final int NEW_PAGES = 3;

    ImageView splashimg;
    LottieAnimationView lottieAnimationView;

    //private static final int NUM_PAGE = 3;
    private ViewPager viewPager;
    private ScreenSlidePagerAdapter pagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        splashimg = findViewById(R.id.bgimg);

        lottieAnimationView = findViewById(R.id.lottie);

        splashimg.animate().translationY(-2500).setDuration(1000).setStartDelay(2000);
        lottieAnimationView.animate().translationY(1800).setDuration(1000).setStartDelay(2000);



        viewPager = findViewById(R.id.pager);
        pagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);

    }

    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter{

        public ScreenSlidePagerAdapter(@NonNull @NotNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @NotNull
        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    OnboardingFragment1 tab1 = new OnboardingFragment1();
                    return tab1;
                case 1:
                    OnboardingFragment2 tab2 = new OnboardingFragment2();
                    return tab2;
                case 2:
                    OnboardingFragment3 tab3 = new OnboardingFragment3();
                    return tab3;

            }
            return null;
        }

        @Override
        public int getCount() {
            return NEW_PAGES;
        }
    }

}