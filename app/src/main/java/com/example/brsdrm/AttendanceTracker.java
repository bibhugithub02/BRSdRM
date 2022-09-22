package com.example.brsdrm;


import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AttendanceTracker extends AppCompatActivity {

    TextView dailyAttendance, attendanceReport, quit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance_tracker);

        //Set the orientation to Portrait for this screen
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);



        dailyAttendance = findViewById(R.id.textView9);
        attendanceReport = findViewById(R.id.textView10);
        quit = findViewById(R.id.textView11);

        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
                System.exit(0);

            }
        });

    }
}