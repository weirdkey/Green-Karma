package com.example.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public abstract class MainActivities extends Activity {
    private BottomNavigationView menu;
    private BottomNavigationItemView home_button;
    private BottomNavigationItemView achievement_button;
    private BottomNavigationItemView progress_button;
    private BottomNavigationItemView profile_button;

    abstract int getLayoutId();

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        setupButtons();

        if (getLayoutId() == R.layout.activity_bottomlayout) {
            resetButtonColors();
            achievement_button.setBackgroundColor(Color.parseColor("#74E39A"));
            TextView txt = (TextView) findViewById(R.id.rewards_label);
            txt.setPaintFlags(txt.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        } else if (getLayoutId() == R.layout.activity_home) {
            resetButtonColors();
            home_button.setBackgroundColor(Color.parseColor("#74E39A"));
        } else if (getLayoutId() == R.layout.activity_profile) {
            resetButtonColors();
            profile_button.setBackgroundColor(Color.parseColor("#74E39A"));
        } else if (getLayoutId() == R.layout.activity_leaderboard) {
            resetButtonColors();
            progress_button.setBackgroundColor(Color.parseColor("#74E39A"));

            listView = findViewById(R.id.listview);

            ArrayList<String> arrayList = new ArrayList<>();

            for(int i = 0; i < 48; i+=2) {
                arrayList.add("pishka");
            }

            ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);

            listView.setAdapter(arrayAdapter);
        }
    }

    private void setupButtons() {
        menu = findViewById(R.id.bottom_nav);
        home_button = menu.findViewById(R.id.home);
        achievement_button = menu.findViewById(R.id.trophy);
        progress_button = menu.findViewById(R.id.leaderboard);
        profile_button = menu.findViewById(R.id.user);

        achievement_button.setOnClickListener(v -> {
            Intent switchLayout = new Intent(this, RewardsActivity.class);
            startActivity(switchLayout);
        });

        home_button.setOnClickListener(v -> {
            Intent switchLayout = new Intent(this, HomeActivity.class);
            startActivity(switchLayout);
        });

        progress_button.setOnClickListener(v -> {
            Intent switchLayout = new Intent(this, ProgressActivity.class);
            startActivity(switchLayout);
        });

        profile_button.setOnClickListener(v -> {
            Intent switchLayout = new Intent(this, UserProfile.class);
            startActivity(switchLayout);
        });
    }

    private void resetButtonColors() {
        home_button.setBackgroundColor(112182);
        achievement_button.setBackgroundColor(112182);
        progress_button.setBackgroundColor(112182);
        profile_button.setBackgroundColor(112182);
    }
}
