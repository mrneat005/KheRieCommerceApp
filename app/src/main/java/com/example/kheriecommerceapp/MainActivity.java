package com.example.kheriecommerceapp;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Pair;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Variables
    Animation topAnim,bottomAnim;
    ImageView image;
    TextView slogan;
   private static int SPLASH_sCREEN=5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        //Animation
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        //hooks

        image = findViewById(R.id.imageView);
        slogan = findViewById(R.id.textView);

        image.setAnimation(topAnim);
        slogan.setAnimation(bottomAnim);

new Handler().postDelayed(new Runnable() {
    @Override
    public void run() {
        Intent intent = new Intent(MainActivity.this,LoginActivity.class);
       Pair[] pairs = new Pair[2];
       pairs[0] = new Pair<View,String>(image,"logo_image");
       pairs[1] = new Pair<View,String>(slogan,"logo_text");


        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pairs);
        startActivity(intent,options.toBundle());
    }
},SPLASH_sCREEN);
    }
}