package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

//        getSupportActionBar().hide();
//        getWindow().setFlags(
//                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
//                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
//        );

        Thread thread = new Thread(){
            public void run(){
                try{
                    sleep(1000);  //1sec = 1000
                }
                catch (Exception e){
                    e.printStackTrace();  // contains all type of exceptions when error occurs
                }
                finally {
                    Intent intent = new Intent(SplashScreen.this , MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };thread.start();

    }
}