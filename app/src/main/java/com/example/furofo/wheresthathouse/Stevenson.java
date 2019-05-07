package com.example.furofo.wheresthathouse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Stevenson extends AppCompatActivity {
    Button PmcButton;
    Button WWLButton;
    Button GMCButton;
    Button CAWButton;
    Button TRLButton;
    Button RTRButton;
    Button GPPButton;
    Button GPTButton;
    Button MPRButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stevenson);
        PmcButton = (Button) findViewById(R.id.PMC_button);
        WWLButton = (Button) findViewById(R.id.WWL_button);
        TRLButton = (Button) findViewById(R.id.TRL_button);
        CAWButton = (Button) findViewById(R.id.CAW_button);
        GMCButton = (Button) findViewById(R.id.GMC_button);
        RTRButton = (Button) findViewById(R.id.RTR_button);
        GPPButton = (Button) findViewById(R.id.GPP_button);
        GPTButton = (Button) findViewById(R.id.GPT_button);
        MPRButton = (Button) findViewById(R.id.MPR_button);


        PmcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bringPmc = new Intent(Stevenson.this, PMC.class);
                startActivity(bringPmc);
            }
        });


        WWLButton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent bringWWL = new Intent(Stevenson.this, WWL.class);
                startActivity(bringWWL);
            }
        });
        TRLButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bringTRL = new Intent(Stevenson.this, TRL.class);
                startActivity(bringTRL);
            }
        });
        CAWButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bringCAW = new Intent(Stevenson.this, CAW.class);
                startActivity(bringCAW);
            }
        });
        GMCButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bringGMC = new Intent(Stevenson.this, GMC.class);
                startActivity(bringGMC);
            }
        });

        GPPButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bringPmc = new Intent(Stevenson.this, GPP.class);
                startActivity(bringPmc);
            }
        });
        GPTButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bringPmc = new Intent(Stevenson.this, GPT.class);
                startActivity(bringPmc);
            }
        });
        MPRButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bringPmc = new Intent(Stevenson.this, MPR.class);
                startActivity(bringPmc);
            }
        });
        RTRButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bringPmc = new Intent(Stevenson.this, RTR.class);
                startActivity(bringPmc);
            }
        });

    }
}
