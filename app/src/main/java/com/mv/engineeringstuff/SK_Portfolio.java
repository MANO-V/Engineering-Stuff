package com.mv.engineeringstuff;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SK_Portfolio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.s_k);

        WebView sk_portfolio=findViewById(R.id.sk_portfolio);
        sk_portfolio.setWebViewClient(new WebViewClient());
        sk_portfolio.getSettings().setJavaScriptEnabled(true);
        sk_portfolio.loadUrl("https://sureshk09.github.io/SureshKanna/");
    }
}
