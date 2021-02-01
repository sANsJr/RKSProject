package com.example.grabapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;

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
        scrollView.scrollTo(450,0);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,SplashActivity.class);
                startActivity(i);
            }
        });
        fav_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_favorite);
            }
        });
        hist_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.acitivity_history);
            }
        });
    }
    public void BackNav(View view){
        Intent i=new Intent(MainActivity.this,MainActivity.class);
        startActivity(i);
    }
}