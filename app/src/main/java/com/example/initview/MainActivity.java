package com.example.initview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.initview.view.CustomView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomView _customView = new CustomView(this);
//        _customView.setAnimation(AnimationUtils.loadAnimation(this,R.anim.translate));
        _customView.smoothScrollTo(-400,0);
    }
}
