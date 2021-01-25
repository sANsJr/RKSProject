package com.example.grabapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class SplashActivity extends AppCompatActivity {
    public LinearLayout nxt_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        nxt_btn=(LinearLayout)findViewById(R.id.next_button);
        nxt_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SplashActivity.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}