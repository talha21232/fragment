package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstfragment fragment1= new firstfragment();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment1,fragment1).commit();
    }
}