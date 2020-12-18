package com.mv.engineeringstuff;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MVTECH extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m_v_t_e_c_h);

        WebView mvtech=findViewById(R.id.mvtech);
        mvtech.setWebViewClient(new WebViewClient());
        mvtech.getSettings().setJavaScriptEnabled(true);
        mvtech.loadUrl("https://mano-v.github.io/MVTECH.com/");
    }
}
