package com.mv.engineeringstuff;

import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.view.Gravity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class dark_mode extends AppCompatActivity {
    SharedPref sharedpref;
    private Switch myswitch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        sharedpref = new SharedPref(this);
        if (sharedpref.loadNightModeState()) {
            setTheme(R.style.darktheme);
        } else setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dark_mode);




       myswitch = findViewById(R.id.switch1);
        if (sharedpref.loadNightModeState() == true) {
            myswitch.setChecked(true);
        }
        myswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    sharedpref.setNightModeState(true);
                    restart();

                } else {
                    sharedpref.setNightModeState(false);
                    restart();
                }
            }
        });
    }



    private void restart() {
        final Toast toast = Toast.makeText(getApplicationContext(), "App Restart Required", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                toast.cancel();
                finish();
            }
        }, 3000);


        Process.killProcess(Process.myPid());
    }


}
