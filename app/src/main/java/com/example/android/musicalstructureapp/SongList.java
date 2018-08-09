package com.example.android.musicalstructureapp;

import java.util.ArrayList;

/**
 * Created by clarissajarem on 8/9/18.
 */

public class SongList {
    public static final ArrayList<Song> SONGS = new ArrayList<>();

    static {
        SONGS.add(new Song("Svdisthana", "Robin Silver"));
        SONGS.add(new Song("Happier", "Ed Sheeran"));
        SONGS.add(new Song("Longing for the Unknown", "Karunesh"));
    }
}
