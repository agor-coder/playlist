/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.javastart.playlist;

/**
 *
 * @author ET4
 */
public class PlaylistTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Song song1 = new Song("ula", 1460);
        Song song2 = new Song("kok", 360);
        Song song3 = new Song("kok", 1360);
        Song song4 = new Song("kok", 360);
        Song song5 = new Song("kok", 360);
        Song song6 = new Song("kok", 2360);
        int sec = Playlist.playlistLenght(song1, song2,song3, song4,song5, song6);
        Playlist.getFormattedTime(sec);
        
    }    
    
}
