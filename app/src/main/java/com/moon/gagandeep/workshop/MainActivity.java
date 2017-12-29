package com.moon.gagandeep.workshop;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    TextInputEditText mUsername, mPassword;
    ImageView mImageView;
    Button mLogin;
    FloatingActionButton mReset;
    public static final String LOGIN = "android";
    public static final String PASSWORD = "123456";
    public static final String URL_IMAGE = "https://euw.leagueoflegends.com/sites/default/files/styles/wide_medium/public/upload/lol_promoart_8_2.jpg?itok=K8l8hVW_";
    Button mRotate, mTranslate, mScale, mAlpha, mMultiple;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();




      animationCollection();
    }

    private void animationCollection() {
        mAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAlpha(mAlpha);

            }
        });


        mTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playTranslate(mTranslate);
            }
        });

        mScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playScale(mScale);
            }
        });

        mRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playRotate(mRotate);

            }
        });

        mMultiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playMultiple(mMultiple);
            }
        });
    }

    private void playMultiple(Button mMultiple) {

        ObjectAnimator mObjectAnimatorX = ObjectAnimator.ofFloat(mMultiple, View.SCALE_X, 1, 2);
        mObjectAnimatorX.setDuration(300);
        mObjectAnimatorX.setRepeatCount(ValueAnimator.INFINITE);
        mObjectAnimatorX.setRepeatMode(ValueAnimator.REVERSE);
        mObjectAnimatorX.start();
        ObjectAnimator mObjectAnimatorY = ObjectAnimator.ofFloat(mMultiple, View.SCALE_Y, 1, 2);
        mObjectAnimatorY.setDuration(300);
        mObjectAnimatorY.setRepeatCount(ValueAnimator.INFINITE);
        mObjectAnimatorY.setRepeatMode(ValueAnimator.REVERSE);
        mObjectAnimatorY.start();

        ObjectAnimator mObjectAnimator_X = ObjectAnimator.ofFloat(mMultiple, View.TRANSLATION_X, 1, 50);
//        mObjectAnimator.ofFloat(mTranslate, View.TRANSLATION_Y, 1, 50);
        mObjectAnimator_X.setDuration(300);
        mObjectAnimator_X.setRepeatCount(ValueAnimator.INFINITE);
        mObjectAnimator_X.setRepeatMode(ValueAnimator.REVERSE);
        mObjectAnimator_X.start();
        ObjectAnimator mObjectAnimator_Y = ObjectAnimator.ofFloat(mMultiple, View.TRANSLATION_Y, 1, 50);
//        mObjectAnimator.ofFloat(mTranslate, View.TRANSLATION_Y, 1, 50);
        mObjectAnimator_Y.setDuration(300);
        mObjectAnimator_Y.setRepeatCount(ValueAnimator.INFINITE);
        mObjectAnimator_Y.setRepeatMode(ValueAnimator.REVERSE);
        mObjectAnimator_Y.start();


        ObjectAnimator mObjectAnimator = ObjectAnimator.ofFloat(mMultiple, View.ROTATION, 0, 270);
        mObjectAnimator.setDuration(300);
        mObjectAnimator.setRepeatCount(ValueAnimator.INFINITE);
        mObjectAnimator.setRepeatMode(ValueAnimator.REVERSE);
        mObjectAnimator.start();

    }

    private void playRotate(Button mRotate) {
        ObjectAnimator mObjectAnimator = ObjectAnimator.ofFloat(mRotate, View.ROTATION, 0, 270);
        mObjectAnimator.setDuration(300);
        mObjectAnimator.setRepeatCount(ValueAnimator.INFINITE);
        mObjectAnimator.setRepeatMode(ValueAnimator.REVERSE);
        mObjectAnimator.start();

    }
    private void playTranslate(Button mTranslate) {
        ObjectAnimator mObjectAnimatorX = ObjectAnimator.ofFloat(mTranslate, View.TRANSLATION_X, 1, 50);
//        mObjectAnimator.ofFloat(mTranslate, View.TRANSLATION_Y, 1, 50);
        mObjectAnimatorX.setDuration(300);
        mObjectAnimatorX.setRepeatCount(ValueAnimator.INFINITE);
        mObjectAnimatorX.setRepeatMode(ValueAnimator.REVERSE);
        mObjectAnimatorX.start();
        ObjectAnimator mObjectAnimatorY = ObjectAnimator.ofFloat(mTranslate, View.TRANSLATION_Y, 1, 50);
//        mObjectAnimator.ofFloat(mTranslate, View.TRANSLATION_Y, 1, 50);
        mObjectAnimatorY.setDuration(300);
        mObjectAnimatorY.setRepeatCount(ValueAnimator.INFINITE);
        mObjectAnimatorY.setRepeatMode(ValueAnimator.REVERSE);
        mObjectAnimatorY.start();





    }
    private void playScale(Button mScale) {


        ObjectAnimator mObjectAnimatorX = ObjectAnimator.ofFloat(mScale, View.SCALE_X, 1, 2);
        mObjectAnimatorX.setDuration(300);
        mObjectAnimatorX.setRepeatCount(ValueAnimator.INFINITE);
        mObjectAnimatorX.setRepeatMode(ValueAnimator.REVERSE);
        mObjectAnimatorX.start();
        ObjectAnimator mObjectAnimatorY = ObjectAnimator.ofFloat(mScale, View.SCALE_Y, 1, 2);
        mObjectAnimatorY.setDuration(300);
        mObjectAnimatorY.setRepeatCount(ValueAnimator.INFINITE);
        mObjectAnimatorY.setRepeatMode(ValueAnimator.REVERSE);
        mObjectAnimatorY.start();

    }
    private void playAlpha(Button mAlpha) {
         ObjectAnimator mObjectAnimator = ObjectAnimator.ofFloat(mAlpha, View.ALPHA, 1, 0);
         mObjectAnimator.setDuration(300);
         mObjectAnimator.setRepeatCount(ValueAnimator.INFINITE);
        mObjectAnimator.setRepeatMode(ValueAnimator.REVERSE);
        mObjectAnimator.start();
    }



    private void initViews() {
        mAlpha = findViewById(R.id.alpha);
        mTranslate = findViewById(R.id.translate);
        mScale = findViewById(R.id.scale);
        mRotate = findViewById(R.id.rotate);
        mMultiple = findViewById(R.id.multiple);
    }
}
