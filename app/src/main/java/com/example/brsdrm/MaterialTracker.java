package com.example.brsdrm;


import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MaterialTracker extends AppCompatActivity {

    TextView itemConfiguration,materialsList, purchaseRequest,materialsReceived, materialsConsumed, stokeInHand, quit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_tracker);

        //Set the orientation to Portrait for this screen
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);



        itemConfiguration = findViewById(R.id.textView19);
        materialsList = findViewById(R.id.textView20);
        purchaseRequest = findViewById(R.id.textView21);
        materialsReceived = findViewById(R.id.textView22);
        materialsConsumed = findViewById(R.id.textView23);
        stokeInHand = findViewById(R.id.textView24);
        quit = findViewById(R.id.textView25);

        itemConfiguration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
        materialsList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
        purchaseRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
        materialsReceived.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
        materialsConsumed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        stokeInHand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


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