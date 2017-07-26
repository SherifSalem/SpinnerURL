package com.example.sherif.spinnerurls;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    String[] list = {" ","GOOGLE", "FACEBOOK"};
    Spinner spnr;
    WebView webView;
String url = "http://www.google.com";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView =(WebView) findViewById(R.id.web_view);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("www.google.com");
        spnr = (Spinner)findViewById(R.id.spinner);



        ArrayAdapter adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item,list);
        spnr.setAdapter(adapter);
        spnr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {



            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        webView.setWebViewClient(new CustomWebViewClient());

    }
    private class CustomWebViewClient extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading (WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }


}
