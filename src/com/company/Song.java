package com.company;

/**
 * Created by student on 10/11/16.
 */
public class Song {
    String mSongName;
    String mArtistName;
    String mAlbumName;

    public Song(String song, String artistName, String albumName){
        mSongName = song;
        mArtistName = artistName;
        mAlbumName = albumName;
    }

    public void play(){
        System.out.println("Now Playing: " + mSongName + " by " + mArtistName + " from " + mAlbumName);
    }
}
