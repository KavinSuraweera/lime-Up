package com.adrenaline.limeup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView bgimg ,txtLogo;
    Animation bganim, slideUp;
    Button btn_start;
    ImageButton btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bgimg = findViewById(R.id.main_back);
        txtLogo = findViewById(R.id.text_logo);
        bganim = AnimationUtils.loadAnimation(this,R.anim.homeanim);
        slideUp = AnimationUtils.loadAnimation(this,R.anim.logoanim);
        bgimg.animate().translationY(-2400).setDuration(500).setStartDelay(10);
        txtLogo.animate().translationY(-500).setDuration(500).setStartDelay(10);
        txtLogo.startAnimation(slideUp);
        bgimg.startAnimation(slideUp);

        btn_start = findViewById(R.id.startbutton);

        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), userSignUpOptions.class);
                startActivity(intent);
            }
        });



        /* Hide header and footer */
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;

        decorView.setSystemUiVisibility(uiOptions);

    }
}