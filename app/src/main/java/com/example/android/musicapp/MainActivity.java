package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set content of the activity to use the activity_main.xml
        setContentView(R.layout.activity_main);

        //find the view that shows the songs
        final TextView songs = findViewById(R.id.songs_list);
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
    }
}
