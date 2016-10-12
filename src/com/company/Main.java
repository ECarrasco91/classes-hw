package com.company;

public class Main {

    public static void main(String[] args) {

        User me = new User("Ezequiel");
        Song myFav0 = new Song("Breaking The Habit", "Linkin Park", "Meteora");
        Song myFav1 = new Song("Happiness", "The Fray", "The Fray");
        Song myFav2 = new Song("Waste A Moment", "Kings of Leon", "WALLS");
        Song myFav3 = new Song("That Part", "ScHoolboyQ", "Blank Face");
        Song myFav4 = new Song("Wet Dreamz", "J.Cole", "2014 Forest Hills Drive");

        Playlist alternative = new Playlist("Alternative");
        Playlist hiphop = new Playlist("HipHop");

        alternative.addSong(myFav0);
        alternative.addSong(myFav1);
        alternative.addSong(myFav2);
        hiphop.addSong(myFav3);
        hiphop.addSong(myFav4);

        me.addPlaylist(alternative);
        me.addPlaylist(hiphop);

        System.out.println("Playlists: [" + alternative.getName() + ", " + hiphop.getName() + "]");
        System.out.println("Playing: " + alternative.getName());
        alternative.playAll();
        System.out.println("Playing: " + hiphop.getName());
        hiphop.playAll();
    }
}
