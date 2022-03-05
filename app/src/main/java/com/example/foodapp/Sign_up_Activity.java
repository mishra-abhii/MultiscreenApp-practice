package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Sign_up_Activity extends AppCompatActivity {

    TextView alreadyhaveaccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

//        getSupportActionBar().setTitle("Sign Up");

        alreadyhaveaccount = findViewById(R.id.alreadyhaveaccount);
        alreadyhaveaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sign_up_Activity.this , Sign_In_Activity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}