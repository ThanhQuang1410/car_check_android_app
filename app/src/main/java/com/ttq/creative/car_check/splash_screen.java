package com.ttq.creative.car_check;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import static java.lang.Thread.sleep;

public class splash_screen extends AppCompatActivity {
    private ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        iv = (ImageView) findViewById(R.id.iv);
        Animation myAnim = AnimationUtils.loadAnimation(this,R.anim.transition);
        iv.startAnimation(myAnim);
        final Intent i = new Intent(this,start_page.class);
        Thread timer = new Thread(){
            public void run() {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(i);
                    finish();
                }
            }
        };
            timer.start();
    }
}
