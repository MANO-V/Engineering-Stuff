package com.mv.engineeringstuff;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class eee_semlayout extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawer;
    NavigationView nv;
    Animation atg, atg1, atg2, atg3, atg4, atg5,atg6, atglr1;
    Button eee_sem_1,eee_sem_2,eee_sem_3,eee_sem_4,eee_sem_5,eee_sem_6,eee_sem_7,eee_sem_8;
    ImageView outer_sem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SharedPref sharedpref = new SharedPref(this);
        if(sharedpref.loadNightModeState()) {
            setTheme(R.style.darktheme);
        }
        else  setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eee_semlayout);
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.papers,new eee_sem1_list());
        transaction.commit();

        Toolbar toolbar = findViewById(R.id.toolbar);

        drawer = findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toogle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toogle);
        toogle.syncState();

        nv = findViewById(R.id.nav_view);
        nv.setNavigationItemSelectedListener(this);


        eee_semesters();
        animation();



    }



        private void animation() {

            eee_sem_1=findViewById(R.id.eee_sem1);
            eee_sem_2=findViewById(R.id.eee_sem2);
            eee_sem_3=findViewById(R.id.eee_sem3);
            eee_sem_4=findViewById(R.id.eee_sem4);
            eee_sem_5=findViewById(R.id.eee_sem5);
            eee_sem_6=findViewById(R.id.eee_sem6);
            eee_sem_7=findViewById(R.id.eee_sem7);
            eee_sem_8=findViewById(R.id.eee_sem8);

            outer_sem=findViewById(R.id.outer_sem);

            atg = AnimationUtils.loadAnimation(getApplication(), R.anim.atg);

            atg1 = AnimationUtils.loadAnimation(getApplication(), R.anim.atg1);
            atg2 = AnimationUtils.loadAnimation(getApplication(), R.anim.atg2);
            atg3 = AnimationUtils.loadAnimation(getApplication(), R.anim.atg3);
            atg4 = AnimationUtils.loadAnimation(getApplication(), R.anim.atg4);
            atg5 = AnimationUtils.loadAnimation(getApplication(), R.anim.atg5);
            atg6 = AnimationUtils.loadAnimation(getApplication(), R.anim.atg6);

            atglr1 = AnimationUtils.loadAnimation(getApplication(), R.anim.atg_lr1);



            eee_sem_1.startAnimation(atg1);
            eee_sem_2.startAnimation(atg2);
            eee_sem_3.startAnimation(atg3);
            eee_sem_4.startAnimation(atg4);
            eee_sem_5.startAnimation(atg5);
            eee_sem_6.startAnimation(atg6);

            outer_sem.startAnimation(atglr1);

        }

    private void eee_semesters() {
        eee_sem_1();
        eee_sem_2();
        eee_sem_3();
        eee_sem_4();
        eee_sem_5();
        eee_sem_6();
        eee_sem_7();
        eee_sem_8();
    }

    private void  eee_sem_1() {
        eee_sem_1=findViewById(R.id.eee_sem1);
        eee_sem_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.papers,new eee_sem1_list());
                transaction.commit();
            }
        });

    }
    private void  eee_sem_2() {
        eee_sem_2=findViewById(R.id.eee_sem2);
        eee_sem_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.papers,new eee_sem2_list());
                transaction.commit();
            }
        });

    }
    private void  eee_sem_3() {
        eee_sem_3=findViewById(R.id.eee_sem3);
        eee_sem_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.papers,new eee_sem3_list());
                transaction.commit();
            }
        });

    }
    private void  eee_sem_4() {
        eee_sem_4=findViewById(R.id.eee_sem4);
        eee_sem_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.papers,new eee_sem4_list());
                transaction.commit();
            }
        });

    }

    private void  eee_sem_5() {
        eee_sem_5=findViewById(R.id.eee_sem5);
        eee_sem_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.papers,new eee_sem5_list());
                transaction.commit();
            }
        });

    }
    private void  eee_sem_6() {
        eee_sem_6=findViewById(R.id.eee_sem6);
        eee_sem_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.papers,new eee_sem6_list());
                transaction.commit();
            }
        });

    }

    private void  eee_sem_7() {
        eee_sem_7=findViewById(R.id.eee_sem7);
        eee_sem_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.papers,new eee_sem7_list());
                transaction.commit();
            }
        });

    }
    private void  eee_sem_8() {
        eee_sem_8=findViewById(R.id.eee_sem8);
        eee_sem_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.papers,new eee_sem8_list());
                transaction.commit();
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
                String shareBody = "You can install it from ......... ";
                String shareSub = "Your Subject here";
                share.putExtra(Intent.EXTRA_SUBJECT, shareBody);
                share.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(share, "Share using"));
                break;

            case R.id.exit:
                new AlertDialog.Builder(this)
                        .setIcon(android.R.drawable.ic_dialog_alert)
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
