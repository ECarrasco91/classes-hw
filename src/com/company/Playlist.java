package com.company;

import java.util.ArrayList;

/**
 * Created by student on 10/11/16.
 */
public class Playlist {
    String mName;
    ArrayList<Song> mSongs;

    public Playlist(String name){
        mName = name;
        mSongs = new ArrayList<>();
    }

    public String getName(){
        return mName;
    }

    public void addSong(Song song){
        mSongs.add(song);
    }

    public void playAll(){
        for (Song song : mSongs) {
            song.play();
        }
    }
}
