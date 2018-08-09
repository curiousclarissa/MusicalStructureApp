package com.example.android.musicalstructureapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by clarissajarem on 8/8/18.
 */

public class SongAdapter extends ArrayAdapter<Song> {
    /**
     * from udacity course on custom adapters and the androidflavor example
     */
    private static final String LOG_TAG = SongAdapter.class.getSimpleName();

    public SongAdapter(Context context, ArrayList<Song> songs) {

        super(context,0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link song} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView songTitleTextView = (TextView) listItemView.findViewById(R.id.songTitle_textView);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        songTitleTextView.setText(currentSong.getmSongTitle());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView songArtistTextView = (TextView) listItemView.findViewById(R.id.songArtist_textView);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        songArtistTextView.setText(currentSong.getmSongArtist());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
