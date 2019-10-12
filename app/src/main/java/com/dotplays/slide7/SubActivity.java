package com.dotplays.slide7;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class SubActivity extends AppCompatActivity {

    private ImageView loading;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        loading = findViewById(R.id.imgLoading);

        loading.setImageResource(R.drawable.loading);

        AnimationDrawable animationDrawable = (AnimationDrawable)
                loading.getDrawable();
        animationDrawable.start();

    }
}
