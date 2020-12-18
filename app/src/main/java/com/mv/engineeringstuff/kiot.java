package com.mv.engineeringstuff;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class kiot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kiot);

        WebView kiot=findViewById(R.id.kiot);
        kiot.setWebViewClient(new WebViewClient());
        kiot.getSettings().setJavaScriptEnabled(true);
        kiot.loadUrl("https://www.kiot.ac.in/");
    }
}
