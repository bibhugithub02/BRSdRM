package com.example.brsdrm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView cong, materialTracker, attendanceTracker, paymentTacker, travelTracker, approvals, quit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set the orientation to Portrait for this screen
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        materialTracker = findViewById(R.id.textView2);
        attendanceTracker = findViewById(R.id.textView3);
        paymentTacker = findViewById(R.id.textView4);
        travelTracker = findViewById(R.id.textView5);
        quit = findViewById(R.id.textView6);
        approvals = findViewById(R.id.textView8);


        attendanceTracker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AttendanceTracker.class);
                startActivity(i);
            }
        });

        approvals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Approvals.class);
                startActivity(i);
            }
        });


        travelTracker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, TravelExpenses.class);
                startActivity(i);
            }
        });

        paymentTacker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PayMentTracker.class);
                startActivity(i);
            }
        });


        materialTracker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MaterialTracker.class);
                startActivity(i);
            }
        });

        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
                System.exit(0);

            }
        });

    }
}