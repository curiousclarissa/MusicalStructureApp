package com.example.android.musicalstructureapp;

import java.util.ArrayList;

/**
 * Created by clarissajarem on 8/9/18.
 */

public class SongList {
    /**Make an array list of songs that can be used across activities,
     * make CONST until integrated with download functions allows user to add more songs to the ArrayList
     */


    public static final ArrayList<Song> SONGS = new ArrayList<>();

    //any song that needs to be available in the app needs to be in this list.

    static {
        SONGS.add(new Song("Svdisthana", "Robin Silver"));
        SONGS.add(new Song("Happier", "Ed Sheeran"));
        SONGS.add(new Song("Longing for the Unknown", "Karunesh"));
    }
}
