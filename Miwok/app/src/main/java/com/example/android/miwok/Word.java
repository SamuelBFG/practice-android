package com.example.android.miwok;

import android.widget.ImageView;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    public static final int NO_IMAGE_PROVIDED = -1;
    private int mrawID;

    public Word(String defaultTranslation, String miwokTranslation, int resourceId, int rawID){
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mImageResourceID = resourceId;
        this.mrawID = rawID;
    }

    public Word(String defaultTranslation, String miwokTranslation, int rawID){
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mrawID = rawID;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceID(){
        return mImageResourceID;
    }

    public boolean hasImage(){
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

    public int getRawID(){
        return mrawID;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mAudioResourceId=" + mrawID +
                ", mImageResourceId=" + mImageResourceID +
                '}';
    }
}
