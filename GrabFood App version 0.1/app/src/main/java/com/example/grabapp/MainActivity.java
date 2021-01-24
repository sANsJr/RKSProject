package com.example.grabapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    public HorizontalScrollView scrollView;
    public ImageButton back_btn,fav_btn,hist_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scrollView=(HorizontalScrollView)findViewById(R.id.scrollview);
        back_btn=(ImageButton)findViewById(R.id.back_button);
        fav_btn=(ImageButton)findViewById(R.id.favorite_button);
        hist_btn=(ImageButton)findViewById(R.id.history_button);
        scrollView.scrollTo(0,450);
    }
}