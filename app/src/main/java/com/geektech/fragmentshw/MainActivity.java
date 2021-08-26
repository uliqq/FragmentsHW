package com.geektech.fragmentshw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFragments();
       }

    private void initFragments() {
        getSupportFragmentManager().beginTransaction().add(R.id.containerFirst, new FragmentFirst()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.containerSecond, new FragmentSecond()).commit();
    }
}