package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the song activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the View that corresponds to the numbers category
        TextView songs = (TextView)findViewById(R.id.songs);

        //set click listener on that View
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playSongIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(playSongIntent);
            }
        });
    }
}
