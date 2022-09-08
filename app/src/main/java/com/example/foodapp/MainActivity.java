package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //hide action bar
        getSupportActionBar().hide();
        //transparent status bar
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );
        AppCompatButton login;
        AppCompatButton signup;
        TextView textView;
        login=findViewById(R.id.button2);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, Signin_Activity.class);
                startActivity(intent);
            }
        });
        signup=findViewById(R.id.button);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, Signup_Actiivity.class);
                startActivity(intent);
            }
        });
    }

    public void onClick(View view) {
        Intent intent=new Intent(MainActivity.this, MainScreen.class);
        startActivity(intent);
    }
}