package com.example.android.miwok;

/**
 * {@link Word} espresents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translaton for that word.
 */

public class Word
{
    //Default translation for the word
    private String mDefaultTranslation;

    //Miwok translation for the word
    private String mMiwokTranslation;

    // Drawable resource ID - initializing to -1 aka no image
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    //CONSTANT VALUE THAT REPRESENTS NO IMAGE WAS PROVIDED FOR THIS IMAGE
    private  static final int NO_IMAGE_PROVIDED = -1;

    //Audio
    private int mAudioResourceId;

/**
* Create a new Word object.
*
* @param defaultTranslation is the word in a language that the user is already familiar with
*                           (such as English)
* @param miwokTranslation is the word in the Miwok language
* @param imageResourceId is the drawable resource ID for the image associated with the word
*
*/
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

/** Used for phrases - category without image*/
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    //Get the default translation fo the word
    public String getDefultTranslation()
    {
        return mDefaultTranslation;
    }

    //Get the miwok translation fo the word
    public String getMiwokTranslation()
    {
        return mMiwokTranslation;
    }

    /**Get the image resource Id*/
    public int getImageResourceId()
    {
        return mImageResourceId;
    }
    /**returns true if mImageResourceId has different value than -1 aka has a picture*/
    public boolean hasImage()
    {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**Audio**/
    public int getAudioResourceId()
    {
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
