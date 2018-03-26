package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

/**
 * Created by e6420 on 3/26/2018.
 */

public class ListOfSongs extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        // Create a list of words
        ArrayList<Song> songs = new ArrayList<Song>();

        //songs added
        songs.add(new Song("Sing me to sleep", "Alan Walker", R.drawable.number_one));
        songs.add(new Song("I wanna know", "Alesso", R.drawable.number_two));
        songs.add(new Song("I need you", "Armin van Buuren", R.drawable.number_three));
        songs.add(new Song("Meant to be", "Bebe Rexha", R.drawable.number_four));
        songs.add(new Song("Dancing on my own", "Calum Scott", R.drawable.number_five));
        songs.add(new Song("You are the reason", "Calum Scott", R.drawable.number_six));
        songs.add(new Song("IDGAK", "Dua Lipa", R.drawable.number_seven));
        songs.add(new Song("Perfect", "Ed Sheeran", R.drawable.number_eight));
        songs.add(new Song("Don`t", "Ed Sheeran", R.drawable.number_nine));
        songs.add(new Song("Fire", "Gavin DeGraw", R.drawable.number_ten));

//        let`s learn how to debug
//        Log.v( "Word at index 7 is "+songs.get(7));


    }
