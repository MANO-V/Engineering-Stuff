package com.mv.engineeringstuff;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    private static final int PERMISSION_STORAGE = 1000;
    DrawerLayout drawer;
    NavigationView nv;
    Toolbar toolbar;
    Animation atgcontact_us, atg1, atg2, atg3, atg4, atg5;
    Button contact_us, EEE, CSE, MECH, CIVIL, ECE;
    TextView course;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SharedPref sharedpref = new SharedPref(this);
        if (sharedpref.loadNightModeState() == true) {
            setTheme(R.style.darktheme);
        } else setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contact_us();
        animation();
        permission();
        Course();




        toolbar = findViewById(R.id.toolbar);
        drawer = findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toogle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toogle);
        toogle.syncState();

        nv = findViewById(R.id.nav_view);
        nv.setNavigationItemSelectedListener(this);

        View headerview=nv.getHeaderView(0);
        ImageView kiot_logo=headerview.findViewById(R.id.kiot_logo);
        kiot_logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),kiot.class));
            }
        });

    }



    private void permission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
                String[] pemission = {Manifest.permission.WRITE_EXTERNAL_STORAGE};
                requestPermissions(pemission, PERMISSION_STORAGE);
            }
        }
    }

    private void animation() {
        atg1 = AnimationUtils.loadAnimation(this, R.anim.atg1);
        atg2 = AnimationUtils.loadAnimation(this, R.anim.atg2);
        atg3 = AnimationUtils.loadAnimation(this, R.anim.atg3);
        atg4 = AnimationUtils.loadAnimation(this, R.anim.atg4);
        atg5 = AnimationUtils.loadAnimation(this, R.anim.atg5);

        EEE = findViewById(R.id.eeebtn);
        MECH = findViewById(R.id.mechbtn);
        CSE = findViewById(R.id.csebtn);
        ECE = findViewById(R.id.ecebtn);
        CIVIL = findViewById(R.id.civilbtn);
        course = findViewById(R.id.course);

        EEE.startAnimation(atg1);
        MECH.startAnimation(atg2);
        CSE.startAnimation(atg3);
        ECE.startAnimation(atg4);
        CIVIL.startAnimation(atg5);
        course.startAnimation(atg2);
    }

    private void contact_us() {
        atgcontact_us = AnimationUtils.loadAnimation(this, R.anim.atgcontact_us);
        contact_us = findViewById(R.id.contact_us);
        contact_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Contact_us.class));
            }
        });
        contact_us.startAnimation(atgcontact_us);
    }


    private void Course() {
        EEE();
        MECH();
        CSE();
        ECE();
        CIVIL();
    }




    private void EEE() {
        EEE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this, findViewById(R.id.eeebtn), "eee_trans");
                startActivity(new Intent(getApplicationContext(), eee_semlayout.class), optionsCompat.toBundle());
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }
        });
    }
    private void MECH() {
        MECH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Toast toast = Toast.makeText(getApplicationContext(), "Available in upcoming updates", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });
    }

    private void CSE() {
        CSE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Toast toast = Toast.makeText(getApplicationContext(), "Available in upcoming updates", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });
    }

    private void ECE() {
        ECE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Toast toast = Toast.makeText(getApplicationContext(), "Available in upcoming updates", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });
    }

    private void CIVIL() {
        ECE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Toast toast = Toast.makeText(getApplicationContext(), "Available in upcoming updates", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });
    }




    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.home:
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
                System.exit(0);
                break;

            case R.id.about:
                startActivity(new Intent(getApplicationContext(), About.class));
                break;

            case R.id.youtube_link:
                Intent youtube = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCL3LaBMUfad6cB07I_YFr0w"));
                startActivity(youtube);
                break;

            case R.id.share:
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                String shareBody = "You can download it from https://drive.google.com/drive/folders/1t4-_u6xV044tRcqj3i11jm7gdn4e0BK_?usp=sharing ";
                String shareSub = "Your Subject here";
                share.putExtra(Intent.EXTRA_SUBJECT, shareBody);
                share.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(share, "Share using"));
                break;

            case R.id.exit:
                new AlertDialog.Builder(this)
                        .setIcon(R.drawable.ic_exit_to_app_black_24dp)
                        .setTitle("Closing App")
                        .setMessage("Are you sure you want to close this App ?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }

                        })
                        .setNegativeButton("No", null)
                        .show();
                break;

            case R.id.app_info:
                startActivity(new Intent(getApplicationContext(), App_info.class));
                break;


            case R.id.dark_mode:
                startActivity(new Intent(getApplicationContext(), dark_mode.class));
                break;


            case R.id.contact_us:
                startActivity(new Intent(getApplicationContext(), Contact_us.class));
                break;
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
