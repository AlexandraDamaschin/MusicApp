package com.example.android.musicapp;

/**
 * Created by e6420 on 3/26/2018.
 */

public class Song {
    private String mNameSong;
    private String mArtistName;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    //constructor for text views and image
    //nameSong, artistName and image

    public Song(String nameSong, String artistName, int imageResourceId) {
        mNameSong = nameSong;
        mArtistName = artistName;
        mImageResourceId = imageResourceId;
    }

    //    get name song
    public String getNameSong() {
        return mNameSong;
    }

    //  get artist name
    public String getArtistName() {
        return mArtistName;
    }

    //get image
    public int getImageResourceId() {
        return mImageResourceId;
    }

    //check if song has image or not
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
