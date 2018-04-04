package com.example.android.musicapp;

//data model

public class Song {
    private String mNameSong;
    private String mArtistName;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mSong;

    //constructor for text views and image
    //nameSong, artistName and image
    public Song(String nameSong, String artistName, int imageResourceId, int song) {
        this.mNameSong = nameSong;
        this.mArtistName = artistName;
        this.mImageResourceId = imageResourceId;
        this.mSong = song;
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

    //    get song
    public int getSong() {
        return mSong;
    }
}
