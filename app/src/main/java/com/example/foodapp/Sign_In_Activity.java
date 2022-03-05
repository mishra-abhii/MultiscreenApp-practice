package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Sign_In_Activity extends AppCompatActivity {

    TextView wanttocreateaccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

//        getSupportActionBar().setTitle("Sign In");

        wanttocreateaccount = findViewById(R.id.wanttocreateaccount);
        wanttocreateaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sign_In_Activity.this , Sign_up_Activity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}