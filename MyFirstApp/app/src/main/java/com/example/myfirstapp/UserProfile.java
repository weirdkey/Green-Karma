package com.example.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class UserProfile  extends MainActivities {
    private final int layoutID = R.layout.activity_profile;


    @Override
    int getLayoutId() {
        return layoutID;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.profilemenu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this, "Selected Item: " +item.getTitle(), Toast.LENGTH_SHORT).show();
        switch (item.getItemId()) {
            case R.id.about:
                // do your code
                return true;
            case R.id.help:
                // do your code
                return true;
            case R.id.settings:
                // do your code
                return true;
            case R.id.status:
                // do your code
                return true;
            case R.id.privacy:
                // do your code
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
