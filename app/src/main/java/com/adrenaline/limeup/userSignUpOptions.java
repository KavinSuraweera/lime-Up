package com.adrenaline.limeup;

import androidx.activity.OnBackPressedCallback;
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

public class userSignUpOptions extends AppCompatActivity {


    LinearLayout white1, phone;
    Animation slideUp;
    ImageButton btn_back;
    TextView signup,link_create;;
    ActionBar actionBar;
    Toolbar mToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_sign_up_options);


        btn_back = findViewById(R.id.backbutton);
        signup = findViewById(R.id.touch_signup);
        phone = findViewById(R.id.link_phone);
        white1 = findViewById(R.id.white_a);
        white1.animate().translationY(-10).setDuration(500).setStartDelay(10);
        link_create = findViewById(R.id.link_createaccount);

        slideUp = AnimationUtils.loadAnimation(this,R.anim.logoanim);


        mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Sign Up");
        actionBar.setHomeAsUpIndicator(getResources().getDrawable(R.drawable.ic_baseline_chevron_left_24));


        white1.setAnimation(slideUp);

        link_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),createAccount.class);
                startActivity(intent);
            }
        });




        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),login.class);
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