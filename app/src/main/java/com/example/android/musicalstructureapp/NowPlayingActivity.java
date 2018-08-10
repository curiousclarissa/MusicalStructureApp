package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by clarissajarem on 8/8/18.
 * Displays the song that is currently playing including the name of the artist and title
 * TODO: acquire rights and implement true album artwork.
 * broken image icon used with permission
 * Copyright 2018 Material.io

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

public class NowPlayingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        Song song = SongList.SONGS.get(getIntent().getIntExtra("song", 0));
        TextView songTitle = findViewById(R.id.nowPlayingSongTitle);
        songTitle.setText(song.getmSongTitle());
        TextView songArtist = findViewById(R.id.nowPlayingSongArtist);
        songArtist.setText(song.getmSongArtist());
    }
}
