package com.example.furofo.wheresthathouse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HandH extends AppCompatActivity {
    Button WalButton;
    Button LHCButton;
    Button RVLButton;
    Button WGEButton;
    Button MMBButton;
    Button GBRButton;
    Button HORButton;
    Button ARBButton;
    Button CPRButton;
    Button FHHButton;
    Button ADLButton;
    Button SSBButton;
    Button BLPButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hand_h);
        WalButton = (Button) findViewById(R.id.WAL_button);
        WalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bringWal = new Intent(HandH.this, WAL.class);
                startActivity(bringWal);
            }
        });
        GBRButton = (Button) findViewById(R.id.GBR_button);
        GBRButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bringGBR = new Intent(HandH.this, GBR.class);
                startActivity(bringGBR);
            }
        });
        LHCButton = (Button) findViewById(R.id.LHC_button);
        LHCButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bringLHC = new Intent(HandH.this, LHC.class);
                startActivity(bringLHC);
            }
        });
        MMBButton = (Button) findViewById(R.id.MMB_button);
        MMBButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bringMMB = new Intent(HandH.this, MMB.class);
                startActivity(bringMMB);
            }
        });
        RVLButton = (Button) findViewById(R.id.RVL_button);
        RVLButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bringRVL = new Intent(HandH.this, RVL.class);
                startActivity(bringRVL);
            }
        });
        WGEButton = (Button) findViewById(R.id.WGE_button);
        WGEButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bringGBR = new Intent(HandH.this, WGE.class);
                startActivity(bringGBR);
            }
        });
        HORButton = (Button) findViewById(R.id.HOR_button);
        HORButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bringHOR = new Intent(HandH.this, HOR.class);
                startActivity(bringHOR);
            }
        });
        FHHButton = (Button) findViewById(R.id.FHH_button);
        FHHButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bringFHH = new Intent(HandH.this, FHH.class);
                startActivity(bringFHH);
            }
        });
        CPRButton = (Button) findViewById(R.id.CPR_button);
        CPRButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bringCPR = new Intent(HandH.this, CPR.class);
                startActivity(bringCPR);
            }
        });
        ARBButton = (Button) findViewById(R.id.ARB_button);
        ARBButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bringARB = new Intent(HandH.this, ARB.class);
                startActivity(bringARB);
            }
        });
        BLPButton = (Button) findViewById(R.id.BLP_button);
        BLPButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bringBLP = new Intent(HandH.this, BLP.class);
                startActivity(bringBLP);
            }
        });
        ADLButton = (Button) findViewById(R.id.ADL_button);
        ADLButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bringADL = new Intent(HandH.this, ADL.class);
                startActivity(bringADL);
            }
        });
        SSBButton = (Button) findViewById(R.id.SSB_button);
        SSBButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bringSSB = new Intent(HandH.this, SSB.class);
                startActivity(bringSSB);
            }
        });
    }
}
