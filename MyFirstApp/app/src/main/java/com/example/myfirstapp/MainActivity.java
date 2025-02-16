package com.example.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity implements View.OnClickListener {
    private Button login_button;
    private Button login_button2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.login_button = findViewById(R.id.login_button);

        login_button.setOnClickListener(v -> {
            final EditText tv1 = findViewById(R.id.login_email);
            final EditText tv2 = findViewById(R.id.login_password);
            CharSequence username = tv1.getText();
            CharSequence password = tv2.getText();
            if (Verificator.verificate(username, password)) {
                Intent switchLayout = new Intent(this, HomeActivity.class);
                startActivity(switchLayout);
            }
        });
        this.login_button2 = findViewById(R.id.login_button2);
        login_button2.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login_button2:
                Intent switchLayout = new Intent(this, RegisterActivity.class);
                startActivity(switchLayout);
        }
    }
}