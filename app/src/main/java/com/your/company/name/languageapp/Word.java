package com.your.company.name.languageapp;

public class Word {

    private String mMiwokText;
    private String mEnglishText;
    private int mResourceID = -1 ;

    // -1 because noImage is going to be set intially
    //
    // ImageView image1 = findViewById(R.id.imagename);
    //
    // So,
    //  R.id.imagename is return and 'integer' value and a resourceID
    //  R.id.number_six.png

    public Word(String miwokText, String englishText, int imageResourceID)
    {
        mMiwokText = miwokText;
        mEnglishText = englishText;
        mResourceID = imageResourceID;
    }

    public String getMiwokText()
    {
        return mMiwokText;
    }

    public String getEnglishText()
    {
        return mEnglishText;
    }

    public int getImage()
    {
        return mResourceID;
    }

}