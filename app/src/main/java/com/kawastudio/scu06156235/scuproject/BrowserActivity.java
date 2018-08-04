package com.kawastudio.scu06156235.scuproject;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class BrowserActivity extends AppCompatActivity {
     private Button mPreviousButton;
    private Button mNextButton;
    private Button mReloadButton;
    private Button mStopButton;
    private Button mHomeButton;
    private WebView mWebView;
private String mHomeUrl="https://news.google.com/?hl=zh-TW&gl=TW&ceid=TW:zh-Hant";
  private  ProgressDialog mProgressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);
        setTitle("網頁瀏覽器");
        mProgressDialog = new ProgressDialog(this); mProgressDialog.setMessage("Loading..."); mProgressDialog.setCancelable(false);
        mPreviousButton=findViewById(R.id.previousButton);
        mNextButton=findViewById(R.id.nextbutton);
        mReloadButton=findViewById(R.id.reloadButton);
        mStopButton=findViewById(R.id.stopButton);
        mHomeButton=findViewById(R.id.homebutton);
        mWebView=findViewById(R.id.webView);
        mPreviousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             mWebView.goBack();
            }
        });

        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
         mWebView.goForward();
            }
        });
        mReloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
          mWebView.reload();
            }
        });
        mStopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mWebView.stopLoading();
            }
        });
        mHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mWebView.loadUrl("http://tw.yahoo.com");
            }
        });
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAppCacheEnabled(true);
        webSettings.setDatabaseEnabled(true); webSettings.setAllowFileAccess(true);
        webSettings.setCacheMode(WebSettings.LOAD_DEFAULT);
        webSettings.setDomStorageEnabled(true);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            mWebView.setLayerType(View.LAYER_TYPE_HARDWARE, null); }
            else {
            mWebView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        }

       mWebView.setWebViewClient(new WebViewClient() {     @Override
       public void onPageStarted(WebView view, String url, Bitmap favicon) {
           super.onPageStarted(view, url, favicon);
          mProgressDialog.show();
       }     @Override
       public void onPageFinished(WebView view, String url) {
           super.onPageFinished(view, url);
           mProgressDialog.hide();
       }
       @Override
       public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
           super.onReceivedError(view, request, error);
           mProgressDialog.hide();
       }
           @Override
           public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
           super.onReceivedHttpError(view, request, errorResponse);
           mProgressDialog.hide();
       } });

        mWebView.loadUrl((mHomeUrl));

    }
}
