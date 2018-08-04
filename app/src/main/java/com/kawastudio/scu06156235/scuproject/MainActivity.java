package com.kawastudio.scu06156235.scuproject;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.edwardvanraak.materialbarcodescanner.MaterialBarcodeScanner;
import com.edwardvanraak.materialbarcodescanner.MaterialBarcodeScannerBuilder;
import com.google.android.gms.vision.barcode.Barcode;
import com.kawastudio.scu06156235.scuproject.Utils.KWSharedPreferenceUtils;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
   private Button mTestButton;
    private Button mBrowserButton;
    private Button mQrcodeButton;
  private ImageView mImageView;;
//    private void pushToActivity(int index) {
//
//        Class activityClass = null;
//       int score=KWSharedPreferenceUtils.getIntegerPreference(this,"score",-1);
//
//
//        switch (index) {
//            case 0:
//                activityClass = TestActivity.class;
//                break;
//            case 1:
//                activityClass = BrowserActivity.class;
//                break;
//            case 2:
//                //activityClass = QrcodeActivity.class;
//                break;
//        }
//
//        if (activityClass == null) {
//            return;
//        }
//
//        Intent intent = new Intent();
//        intent.setClass(MainActivity.this  , activityClass);
//        startActivity(intent);
//    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView=findViewById(R.id.imageView2);
        Picasso.get().load("https://tse3.mm.bing.net/th?id=OIP.ZotRvjDuTphb_KlzhV53wQHaFE&pid=15.1&P=0&w=229&h=157").into(mImageView);
        mTestButton = findViewById(R.id.testButton);
        mBrowserButton = findViewById(R.id.browserButton);
        mQrcodeButton = findViewById(R.id.qrcodeButton);
        mTestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int score = KWSharedPreferenceUtils.getIntegerPreference(MainActivity.this, "score", -1);

                if (score == -1) {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, TestActivity.class);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, TestResultActivity.class);

                    String description = KWSharedPreferenceUtils.getStringPreference(MainActivity.this, "description");
                    Bundle bundle = new Bundle();
                    bundle.putInt("score", score);
                    bundle.putString("description", description);
                    intent.putExtras(bundle);

                    startActivity(intent);
                }
            }
        });
        mBrowserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("SCU","mBrowserButton2 Click");
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, BrowserActivity.class);
                startActivity(intent);
            }
        });
        mQrcodeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("SCU","mQrcodeButton Click");
                startScan();
            }
        });


    }
    private void startScan() {
        /**
         * Build a new MaterialBarcodeScanner
         */
        final MaterialBarcodeScanner materialBarcodeScanner = new MaterialBarcodeScannerBuilder()
                .withActivity(MainActivity.this)
                .withEnableAutoFocus(true)
                .withBleepEnabled(true)
                .withBackfacingCamera()
                .withText("Scanning...")
                .withResultListener(new MaterialBarcodeScanner.OnResultListener() {
                    @Override
                    public void onResult(Barcode barcode) {
                        Toast.makeText(MainActivity.this,barcode.rawValue,Toast.LENGTH_LONG).show();
//                        barcodeResult = barcode;
//                        result.setText(barcode.rawValue);
                    }
                })
                .build();
        materialBarcodeScanner.startScan();
    }
}
