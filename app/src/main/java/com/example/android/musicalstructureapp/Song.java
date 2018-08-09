package com.example.android.musicalstructureapp;

/**
 * Created by clarissajarem on 8/8/18.
 */

public class Song {
    // name of the song
    private String mSongTitle;
    //name of artist
    private String mSongArtist;

    /**
     * @param songTitle is the name of the song
     * @param songArtist is muscian responsible for the song
     */
    public Song(String songTitle, String songArtist){
        mSongTitle = songTitle;
        mSongArtist = songArtist;
    }

    /** get the title of the song
     *
     */
    public String getmSongTitle(){
        return mSongTitle;
    }
    /**
     * get song Artist
     */
    public String getmSongArtist() {
        return mSongArtist;
    }
}
