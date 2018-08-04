package com.kawastudio.scu06156235.scuproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.kawastudio.scu06156235.scuproject.Utils.KWSharedPreferenceUtils;

public class TestResultActivity extends AppCompatActivity {
   private TextView mScoreTextView;
   private TextView mDescriptionTextView;
   private Button mMenuButton;
   private Button mRestartButton;
   public ImageView mImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_result);
        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("score");
        String description = bundle.getString("description");
        saveScore(score, description);
        mScoreTextView = findViewById(R.id.scoreTextView);
        mDescriptionTextView = findViewById(R.id.descriptionTextView);
        mMenuButton = findViewById(R.id.menuButton);
        mRestartButton = findViewById(R.id.restartButton);
        mScoreTextView.setText(score + "分");
        mDescriptionTextView.setText(description);
        mMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        mRestartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(TestResultActivity.this, TestActivity.class);
                startActivity(intent);
                TestResultActivity.this.finish();


            }
        });
        mImageView = findViewById(R.id.imageView);
        if (score >= 12 && score <= 20) {
            mImageView.setImageDrawable(getResources().getDrawable(R.drawable.result_image_01));

        } else if (score >= 21 && score <= 30) {
            mImageView.setImageDrawable(getResources().getDrawable(R.drawable.result_image_02));
        } else if (score >= 31 && score <= 42) {
            mImageView.setImageDrawable(getResources().getDrawable(R.drawable.result_image_03));
        } else if (score >= 43 && score <= 53) {
            mImageView.setImageDrawable(getResources().getDrawable(R.drawable.result_image_04));
        }

    }
        private void saveScore(int score, String description){
            KWSharedPreferenceUtils.setIntegerPreference(this, "score", score);
            KWSharedPreferenceUtils.setStringPreference(this, "description", description);
        }
    }

