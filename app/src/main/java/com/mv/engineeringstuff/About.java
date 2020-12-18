package com.mv.engineeringstuff;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class About extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        SharedPref sharedpref = new SharedPref(this);
        if(sharedpref.loadNightModeState()) {
            setTheme(R.style.darktheme);
        }
        else  setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
    }
}
