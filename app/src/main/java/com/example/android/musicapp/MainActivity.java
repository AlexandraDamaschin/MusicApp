package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set content of the activity to use the activity_main.xml
        setContentView(R.layout.activity_main);

        //find the view that shows the songs
        final TextView songs = (TextView) findViewById(R.id.songs_list);
        //set click listener on that view
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            //intent to open songs activity
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent songsIntent = new Intent(MainActivity.this, ListOfSongs.class);
                // Start the new activity
                startActivity(songsIntent);
            }
        });

        //played songs
        ListView list = (ListView) findViewById(R.id.list);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent songsPlyedIntent = new Intent(PlayedSong.this, ListOfSongs.class);
//                // Start the new activity
                startActivity(songsPlyedIntent);
            }
        });


        //find the view that shows the songs
//        ImageView songPlayed = (ImageView) findViewById(R.id.play_song);
//        songPlayed.setOnClickListener(new View.OnClickListener() {
//            @Override
//            //intent to open songs activity
//            public void onClick(View view) {
//                // Create a new intent to open the {@link NumbersActivity}
//                Intent songsPlyedIntent = new Intent(PlayedSong.this, ListOfSongs.class);
//                // Start the new activity
//                startActivity(songsPlyedIntent);
//            }
//        });
    }
}
