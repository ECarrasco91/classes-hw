package com.company;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by student on 10/11/16.
 */
public class User {
    String mName;
    HashMap<String, Playlist> mPlaylists;

    public User(String name){
        mName = name;
        mPlaylists = new HashMap<>();
    }

    public void addPlaylist(Playlist playlist){
        mPlaylists.put(playlist.getName(), playlist);
    }

    public Set<String> getAllPlaylistNames(){
        return mPlaylists.keySet();
    }

    public Playlist getPlaylistByName(String name){
        if (mPlaylists.containsKey(name)){
            return mPlaylists.get(name);
        } else {
            return null;
        }
    }
}
