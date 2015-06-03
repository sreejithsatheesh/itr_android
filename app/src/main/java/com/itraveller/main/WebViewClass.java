package com.itraveller.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.webkit.WebView;

/**
 * Created by hckr1 on 28-05-2015.
 * Webview created to block the itraveller placeholder in playstore
 */
public class WebViewClass extends Activity {

    private WebView webView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_view);
        webView = (WebView) findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://m.itraveller.com");

    }
}
