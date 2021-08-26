package com.geektech.fragmentshw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView songName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initTv();
    }

    private void initTv() {

        songName = findViewById(R.id.songName);
        String text = getIntent().getStringExtra("text_key");
        songName.setText(text);
    }


}