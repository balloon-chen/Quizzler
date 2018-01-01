package com.londonappbrewery.quizzler;

/**
 * Created by rayismey on 2018/1/1.
 */

public class TrueFalse {

    private int mQusetionID;
    private boolean mAnswer;

    public TrueFalse(int mQusetionResourceID, boolean trueOrFalse){
        mQusetionID = mQusetionResourceID;
        mAnswer = trueOrFalse;
    }

    public int getmQusetionID() {
        return mQusetionID;
    }

    public void setmQusetionID(int mQusetionID) {
        this.mQusetionID = mQusetionID;
    }

    public boolean ismAnswer() {
        return mAnswer;
    }

    public void setmAnswer(boolean mAnswer) {
        this.mAnswer = mAnswer;
    }
}
