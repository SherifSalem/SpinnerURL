package com.example.sherif.spinnerurls;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * Created by sherif on 27/07/17.
 */

public class WebAppInterface {

    Context mContext;

    WebAppInterface (Context c){
        mContext = c;
    }
    @JavascriptInterface
    public void showToast (String toast){
        Toast.makeText(mContext, "Display web page", Toast.LENGTH_SHORT).show();
    }


}
