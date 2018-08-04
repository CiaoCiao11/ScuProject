package com.kawastudio.scu06156235.scuproject;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.kawastudio.scu06156235.scuproject.TestContent.AnswerObject;
import com.kawastudio.scu06156235.scuproject.TestContent.TestObject;

import java.util.Arrays;

public class TestActivity extends AppCompatActivity {
    private TextView mQuestionTextView;
    private RadioGroup mRadioGroup;
    private RadioButton mRadioButton1;
    private RadioButton mRadioButton2;
    private RadioButton mRadioButton3;
    private RadioButton mRadioButton4;
    private Button mPreviousButton;
    private Button mNextButton;
    private TextView mInfoTextView;
    private int mCurrentIndex;
    private TestObject myTestObject=new TestObject();
    private int[] mScoreArray=new int[10];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        mQuestionTextView=findViewById(R.id.questionTextView);
        mRadioGroup=findViewById(R.id.radioGroup);
        mRadioButton1=findViewById(R.id.radioButton1);
        mRadioButton2=findViewById(R.id.radioButton2);
        mRadioButton3=findViewById(R.id.radioButton3);
        mRadioButton4=findViewById(R.id.radioButton4);
        mNextButton=findViewById(R.id.nextbutton);
        mInfoTextView=findViewById(R.id.infoTextView);
        mPreviousButton=findViewById(R.id.prebutton);

        initData();
        mPreviousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mCurrentIndex==0){
                    return;
                }
                if(!checkIsAnswered()){
                    return;
                }
                mCurrentIndex--;
                initData();
            }
        });
        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkIsAnswered()){
                    return;
                }
                if(mCurrentIndex==9){
                    showResult();
                    return;
                }

                mCurrentIndex++;
                initData();
            }
        });
        mRadioButton1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    AnswerObject answerobject=myTestObject.getAnswerObject(mCurrentIndex);
                    mScoreArray[mCurrentIndex]=answerobject.getAnswerScore(0);
                    Log.d("Kawa", Arrays.toString(mScoreArray));
                }
            }
        });
        mRadioButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    AnswerObject answerobject=myTestObject.getAnswerObject(mCurrentIndex);
                    mScoreArray[mCurrentIndex]=answerobject.getAnswerScore(1);
                    Log.d("Kawa", Arrays.toString(mScoreArray));
                }
            }
        });
        mRadioButton3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    AnswerObject answerobject=myTestObject.getAnswerObject(mCurrentIndex);
                    mScoreArray[mCurrentIndex]=answerobject.getAnswerScore(2);
                    Log.d("Kawa", Arrays.toString(mScoreArray));
                }
            }
        });
        mRadioButton4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    AnswerObject answerobject=myTestObject.getAnswerObject(mCurrentIndex);
                    mScoreArray[mCurrentIndex]=answerobject.getAnswerScore(3);
                    Log.d("Kawa", Arrays.toString(mScoreArray));
                }
            }
        });
    }
    private void initData(){
        Log.d("Kawa",Arrays.toString(mScoreArray));
        mRadioGroup.clearCheck();
        String question=myTestObject.getQuestion(mCurrentIndex);
        mQuestionTextView.setText(question);
        AnswerObject answerobject=myTestObject.getAnswerObject(mCurrentIndex);
        mRadioButton1.setText(answerobject.getAnswer(0));
        mRadioButton2.setText(answerobject.getAnswer(1));
        mRadioButton3.setText(answerobject.getAnswer(2));
        mRadioButton4.setText(answerobject.getAnswer(3));
        mInfoTextView.setText(mCurrentIndex+1+"/10");
        if(mCurrentIndex==0){
            mPreviousButton.setVisibility(View.INVISIBLE);

        }
        else{
            mPreviousButton.setVisibility(View.VISIBLE);
        }
        if(mCurrentIndex==9){
            mNextButton.setText("觀看結果");
        }
        else{
            mNextButton.setText("下一題");
        }
    }
    private void showResult() {
        int totalScore = 0;
        for (int score : mScoreArray) {
            totalScore += score;
        }
        String result = myTestObject.getResult((totalScore));
        Intent intent = new Intent();
        intent.setClass(TestActivity.this, TestResultActivity.class);
        Bundle bundle=new Bundle();
        bundle.putInt("score",totalScore);
        bundle.putString("description",myTestObject.getResult(totalScore));
        intent.putExtras(bundle);
        startActivity(intent);
        TestActivity.this.finish();
//        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
//        dialogBuilder
//                .setTitle("測驗結果:")
//                .setMessage(myTestObject.getResult(totalScore))
//                .setPositiveButton("重新測驗", new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int id) {
////點擊後要處理理的動作
//                        mCurrentIndex = 0;
//                        initData();
//                    }
//                })
//
//                .setNegativeButton("返回", new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int id) {
////點擊後要處理理的動作
//                        onBackPressed();
//                    }
//                });
//        dialogBuilder.create();
//        dialogBuilder.show();
    }
    private boolean checkIsAnswered(){
        if(mScoreArray[mCurrentIndex]==0){
            Toast.makeText(this,"未作答",Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}