package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Signin_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        getSupportActionBar().setTitle("Sign in");
    }
}