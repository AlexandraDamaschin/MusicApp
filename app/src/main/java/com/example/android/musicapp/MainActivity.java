package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set content of the activity to use the activity_main.xml
        setContentView(R.layout.activity_main);

        //find the view that shows the numbers cat
        TextView songs = (TextView) findViewById(R.id.songs);
        //set click listener on that view
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, ListOfSongs.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });
    }
}
