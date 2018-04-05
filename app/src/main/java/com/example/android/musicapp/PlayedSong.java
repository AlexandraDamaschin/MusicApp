package com.example.android.musicapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayedSong extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set content of the activity to use the play_song.xml
        setContentView(R.layout.play_song);

        //find the view that shows the songs
        TextView songs = (TextView) findViewById(R.id.song_played);
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            //intent to open songs activity
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent songsIntent = new Intent(PlayedSong.this, ListOfSongs.class);
                // Start the new activity
                startActivity(songsIntent);
            }
        });

        //certain song played
        //find the view that shows the play a song
        ImageView song = (ImageView) findViewById(R.id.play_song);
        //set click listener on that view
        song.setOnClickListener(new AdapterView.OnClickListener() {
            @Override
            //intent to open songs activity
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent songIntent = new Intent(PlayedSong.this, ListOfSongs.class);
                // Start the new activity
                startActivity(songIntent);

                mMediaPlayer = MediaPlayer.create(PlayedSong.this, songs.getAudioResourceId());
                // Start the audio file
                mMediaPlayer.start();
            }
        });
    }
}
