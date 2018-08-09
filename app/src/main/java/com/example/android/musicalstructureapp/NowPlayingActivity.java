package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by clarissajarem on 8/8/18.
 */

public class NowPlayingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        Song song = SongList.SONGS.get(getIntent().getIntExtra("song", 0));
        TextView songTitle = findViewById(R.id.nowPlayingSongTitle);
        songTitle.setText(song.getmSongTitle());
    }
}
