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
    public MediaPlayer  mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        // Create a list of words
        ArrayList<Song> songs = new ArrayList<Song>();

        //songs added
        songs.add(new Song("Sing me to sleep", "Alan Walker", R.drawable.alan_walker, R.raw.sing_me_to_sleep));
        songs.add(new Song("I wanna know", "Alesso", R.drawable.alesso, R.raw.i_wanna_know));
        songs.add(new Song("I need you", "Alesso", R.drawable.alesso, R.raw.i_need_you));
        songs.add(new Song("Meant to be", "Bebe Rexha", R.drawable.bebe_rexha, R.raw.meant_to_be));
        songs.add(new Song("Dancing on my own", "Calum Scott", R.drawable.calum_scott, R.raw.dancing_on_my_own));
        songs.add(new Song("You are the reason", "Calum Scott", R.drawable.calum_scott, R.raw.you_are_the_reason));
        songs.add(new Song("IDGAK", "Dua Lipa", R.drawable.dua_lipa, R.raw.idgak));
        songs.add(new Song("Perfect", "Ed Sheeran", R.drawable.ed_sheeran, R.raw.perfect));
        songs.add(new Song("Don`t", "Ed Sheeran", R.drawable.ed_sheeran, R.raw.dont));
        songs.add(new Song("Fire", "Gavin DeGraw", R.drawable.gavind_degraw, R.raw.fire));

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
//                mMediaPlayer = MediaPlayer.create(PlaySongActivity.this, R.raw.i_wanna_know);
//                mMediaPlayer.start();
//            }
//        });
    }

}
