package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;


import java.util.ArrayList;

public class SongListActivity extends AppCompatActivity {
    private static final String SONG_KEY = "song";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //use the list of songs found in SongList.java

        SongAdapter adapter = new SongAdapter(this, SongList.SONGS);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //explicit call to open nowPlaying activity
                Intent playSongIntent = new Intent(SongListActivity.this, NowPlayingActivity.class);
                //explicit request for specific song details to display
                playSongIntent.putExtra(SONG_KEY, position);
                startActivity(playSongIntent);
            }
        });


        //Find the View that corresponds to the back button image
        ImageView backButton = findViewById(R.id.backButtonSongList);

        //set click listener on the songs View
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //explicitly open the main activity
                Intent backup = new Intent(SongListActivity.this, MainActivity.class);
                startActivity(backup);
            }
        });

    }
}