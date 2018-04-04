package com.example.android.musicapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListOfSongs extends AppCompatActivity {

    private static SongAdapter adapter;
    public Song mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        // Create a list of words
        ArrayList<Song> songs = new ArrayList<Song>();

        //songs added
        songs.add(new Song("Sing me to sleep", "Alan Walker", R.drawable.alan_walker));
        songs.add(new Song("I wanna know", "Alesso", R.drawable.alesso));
        songs.add(new Song("I need you", "Alesso", R.drawable.alesso));
        songs.add(new Song("Meant to be", "Bebe Rexha", R.drawable.bebe_rexha));
        songs.add(new Song("Dancing on my own", "Calum Scott", R.drawable.calum_scott));
        songs.add(new Song("You are the reason", "Calum Scott", R.drawable.calum_scott));
        songs.add(new Song("IDGAK", "Dua Lipa", R.drawable.dua_lipa));
        songs.add(new Song("Perfect", "Ed Sheeran", R.drawable.ed_sheeran));
        songs.add(new Song("Don`t", "Ed Sheeran", R.drawable.ed_sheeran));
        songs.add(new Song("Fire", "Gavin DeGraw", R.drawable.gavind_degraw));

//       debug
        // Log.v("Word at index 7 is " + songs.get(7));

        ListView listView = (ListView) findViewById(R.id.list);
        adapter = new SongAdapter(songs, getApplicationContext());
        listView.setAdapter(adapter);

        ImageView imageView = (ImageView) findViewById(R.id.play_song);
        adapter = new SongAdapter(songs, getApplicationContext());
        listView.setAdapter(adapter);

        //play sound
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, R.raw.unu);
//                mMediaPlayer.start();
//            }
//        });
    }

}
