package com.tommy.oneneo.neowhap.WelcomeSlide;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        startActivity(new Intent(WelcomeActivity.this, IntroActivity.class));
        finish();

    }

}
