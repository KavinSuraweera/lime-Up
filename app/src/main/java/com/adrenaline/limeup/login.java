package com.adrenaline.limeup;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class login extends AppCompatActivity {

    LinearLayout loginback, white1;
    ImageButton btn_back;
    ActionBar actionBar;
    Toolbar toolbar;
    Animation slideUp;
    TextView link_create;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        white1 = findViewById(R.id.white_a);
        white1.animate().translationY(-10).setDuration(500).setStartDelay(10);
        link_create = findViewById(R.id.link_createaccount);


        slideUp = AnimationUtils.loadAnimation(this,R.anim.logoanim);
        /*Toolbar*/

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Login");
        actionBar.setHomeAsUpIndicator(getResources().getDrawable(R.drawable.ic_baseline_chevron_left_black));

        link_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), createAccount.class);
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