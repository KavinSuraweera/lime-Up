package com.adrenaline.limeup;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class userSignUpOptions extends AppCompatActivity {

    LinearLayout white1;
    Animation slideUp;
    ImageButton btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_sign_up_options);

        btn_back = findViewById(R.id.backbutton);

        white1 = findViewById(R.id.white_a);
        white1.animate().translationY(-50).setDuration(800).setStartDelay(10);

        slideUp = AnimationUtils.loadAnimation(this,R.anim.logoanim);

        white1.setAnimation(slideUp);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });


    }
}