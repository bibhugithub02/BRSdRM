package com.example.brsdrm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Approvals extends AppCompatActivity {

    TextView purchanseApproval, supervisorPaymentApproval, quit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_approvals);

        //Set the orientation to Portrait for this screen
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        purchanseApproval = findViewById(R.id.textView28);
        supervisorPaymentApproval = findViewById(R.id.textView29);
        quit = findViewById(R.id.textView30);


        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
                System.exit(0);

            }
        });


    }
}