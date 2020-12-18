package com.mv.engineeringstuff;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Contact_us extends AppCompatActivity {

    Animation atg1, atg2;
    ImageView sk,mv;
    TextView insta_mv,email_mv,insta_sk,email_sk,sk_link,mv_link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SharedPref sharedpref = new SharedPref(this);
        if(sharedpref.loadNightModeState()) {
            setTheme(R.style.darktheme);
        }
        else  setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_us);

        atg1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.atg1);
        atg2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.atg2);

        sk = findViewById(R.id.sk_info);
        mv = findViewById(R.id.mv_info);
        insta_mv=findViewById(R.id.mano_insta);
        email_mv=findViewById(R.id.mano_email);
        insta_sk=findViewById(R.id.sk_insta);
        email_sk=findViewById(R.id.sk_email);



        sk.startAnimation(atg1);
        insta_sk.startAnimation(atg1);
        email_sk.startAnimation(atg1);



        mv.startAnimation(atg2);
        insta_mv.startAnimation(atg2);
        email_mv.startAnimation(atg2);




         insta_mv=findViewById(R.id.mano_insta);
        insta_mv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent insta_mv = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/mano_v_21/"));
                startActivity(insta_mv);
            }
        });

        mv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MVTECH.class));
            }
        });

        sk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),SK_Portfolio.class));
            }
        });


         email_mv=findViewById(R.id.mano_email);
        email_mv.setText(Html.fromHtml("<a href=\"mailto:mano.v210@gmail.com\">Email</a>"));
        email_mv.setMovementMethod(LinkMovementMethod.getInstance());


         insta_sk=findViewById(R.id.sk_insta);
        insta_sk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent insta_sk = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/suresh_kanna__/"));
                startActivity(insta_sk);
            }
        });

        email_sk=findViewById(R.id.sk_email);
        email_sk.setText(Html.fromHtml("<a href=\"mailto:sureshkanna0234@gmail.com\">Email</a>"));
        email_sk.setMovementMethod(LinkMovementMethod.getInstance());


    }
}
