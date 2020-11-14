package com.example.myfirstapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationMenu;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AfterLogin extends Activity {
    private BottomNavigationView menu;
    private BottomNavigationItemView home_button;
    private BottomNavigationItemView achievement_button;
    private BottomNavigationItemView progress_button;
    private BottomNavigationItemView profile_button;
    private FrameLayout background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottomlayout);
        TextView txt = (TextView) findViewById(R.id.rewards_label);
        txt.setPaintFlags(txt.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        menu = findViewById(R.id.bottom_nav);
        ColorFilter cf = new LightingColorFilter(2, 3);
        home_button = menu.findViewById(R.id.home);
        achievement_button = menu.findViewById(R.id.trophy);
        progress_button = menu.findViewById(R.id.leaderboard);
        profile_button = menu.findViewById(R.id.user);

        achievement_button.setOnClickListener(v -> {
            resetButtonColors();
            v.setBackgroundColor(Color.parseColor("#74E39A"));
        });
        home_button.setOnClickListener(v -> {
            resetButtonColors();
            v.setBackgroundColor(Color.parseColor("#74E39A"));
        });
        progress_button.setOnClickListener(v -> {
            resetButtonColors();
            v.setBackgroundColor(Color.parseColor("#74E39A"));
        });
        profile_button.setOnClickListener(v -> {
            resetButtonColors();
            v.setBackgroundColor(Color.parseColor("#74E39A"));
        });
    }

    private void resetButtonColors() {
        home_button.setBackgroundColor(112182);
        achievement_button.setBackgroundColor(112182);
        progress_button.setBackgroundColor(112182);
        profile_button.setBackgroundColor(112182);
    }


}
