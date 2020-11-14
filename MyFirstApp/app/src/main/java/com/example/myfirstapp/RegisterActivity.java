package com.example.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends Activity implements View.OnClickListener {
    private Button register_button2;
    private Button register_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        register_button = findViewById(R.id.register_button);
        register_button.setOnClickListener(v -> {

        });

        register_button2 = findViewById(R.id.register_button2);
        register_button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login_button:
                Intent switchLayout = new Intent(this, MainActivity.class);
                startActivity(switchLayout);
        }
    }
}
