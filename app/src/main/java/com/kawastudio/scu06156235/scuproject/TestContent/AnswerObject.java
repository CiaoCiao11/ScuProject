package com.kawastudio.scu06156235.scuproject.TestContent;

import android.util.Log;

import java.util.ArrayList;

public class AnswerObject {

    private ArrayList<String> mAnswerList;
    private ArrayList<Integer> mAnswerScoreList;

    public AnswerObject(ArrayList<String> answerList, ArrayList<Integer> answerScoreList) {
        if (answerList.size() != answerScoreList.size()) {
            Log.d("SCU", "answerObject: answerList.size" + answerList.size() + " is not as same as answerScoreList.size" + answerScoreList.size());
            mAnswerList = new ArrayList<>();
            mAnswerScoreList = new ArrayList<>();
            return;
        }

        mAnswerList =  (ArrayList<String>) answerList.clone();
        mAnswerScoreList = (ArrayList<Integer>) answerScoreList.clone();
    }

    public String getAnswer(int index) {
        if (index < mAnswerList.size()) {
            return mAnswerList.get(index);
        }
        return "";
    }

    public int getAnswerScore(int index) {
        if (index < mAnswerScoreList.size()) {
            return mAnswerScoreList.get(index).intValue();
        }
        return 0;
    }
}
