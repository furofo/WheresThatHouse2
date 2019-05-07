package com.example.furofo.wheresthathouse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.os.Handler;

public class HomeActivity extends AppCompatActivity {

    ImageButton stevensonButton;
    ImageButton hhButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        hhButton = (ImageButton) findViewById(R.id.hhButt);
        stevensonButton = (ImageButton) findViewById(R.id.StevensonButt);
        stevensonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bringStevensonList = new Intent(HomeActivity.this, Stevenson.class);
                startActivity(bringStevensonList);
            }
        });

        hhButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                Intent bringHhList = new Intent(HomeActivity.this, HandH.class);
                startActivity(bringHhList);
            }
        });
    }
}