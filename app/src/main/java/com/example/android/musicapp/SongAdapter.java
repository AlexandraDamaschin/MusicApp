package com.example.android.musicapp;

        import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.ImageView;
        import android.widget.TextView;

        import java.util.ArrayList;

/**
 * Created by e6420 on 3/26/2018.
 */

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Check if an existing view is being reused, otherwise inflate the view

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Song currentSong = getItem(position);
        //get song name
        TextView songName = (TextView) listItemView.findViewById(R.id.song_text_view);
        songName.setText(currentSong.getNameSong());
        //get artist name
        TextView artistName = (TextView) listItemView.findViewById(R.id.artist_text_view);
        artistName.setText(currentSong.getArtistName());
        //get image view for content
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        //if has image
        if (currentSong.hasImage()) {
            imageView.setImageResource(currentSong.getImageResourceId());
            //set image to be visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            //set image to be invisible= gone
            imageView.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
