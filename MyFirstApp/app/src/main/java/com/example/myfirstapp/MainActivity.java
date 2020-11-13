package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                final EditText tv1 = findViewById(R.id.editTextText1);
                final EditText tv2 = findViewById(R.id.editTextText2);
                CharSequence username = tv1.getText();
                CharSequence password = tv2.getText();
                if (Verificator.verificate(username,password)){
                    setContentView(R.layout.activity_secondary);
                }
            }
        });
    }
}