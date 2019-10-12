package com.dotplays.slide7;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imgBg1;
    private ImageView imgBg2;
    private ImageView imgCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgBg1 = findViewById(R.id.imgBg1);
        imgBg2 = findViewById(R.id.imgBg2);
        imgCar = findViewById(R.id.imgCar);

    }

    public void viewAnimation(View view) {

        Intent intent = new Intent(this,SubActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in,
                R.anim.slide_out);
    }
    public void propertyAnimation(View view) {

        ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(imgBg1,
                "translationX",
                0, -imgBg1.getWidth());
        objectAnimator1.setDuration(6000);
        objectAnimator1.setRepeatCount(100);
        objectAnimator1.setRepeatMode(ValueAnimator.RESTART);
        objectAnimator1.start();

        ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat(imgBg2,
                "translationX",
                imgBg2.getWidth(), 0);
        objectAnimator2.setDuration(6000);
        objectAnimator2.setRepeatCount(100);
        objectAnimator2.setRepeatMode(ValueAnimator.RESTART);
        objectAnimator2.start();

//        Animator animator = AnimatorInflater.loadAnimator(
//                this, R.animator.animation);
//        animator.setTarget(imgCar);
//        animator.start();

    }


    public void drawableAnimation(View view) {

        imgCar.setImageResource(R.drawable.car_animation);

        AnimationDrawable animationDrawable = (AnimationDrawable)
                imgCar.getDrawable();
        animationDrawable.start();
    }
}
