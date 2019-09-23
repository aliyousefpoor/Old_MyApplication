package com.example.ali.myapplication;


import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by Ali on 7/13/2017.
 */

public class ThirdActivity extends AppCompatActivity {

    ImageView kogan;
    ImageView nozhian;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.btn1_activity);


        kogan = (ImageView) findViewById(R.id.kogan);
        nozhian = (ImageView) findViewById(R.id.nozhian);

        Animation anim_m_right = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move_right);
        Animation anim_m_left = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move_left);

        kogan.startAnimation(anim_m_right);
        nozhian.startAnimation(anim_m_left);

        kogan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(ThirdActivity.this, FifthActivity.class));

            }
        });

        nozhian.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(ThirdActivity.this, SixthActivity.class));

            }
        });


    }

}
