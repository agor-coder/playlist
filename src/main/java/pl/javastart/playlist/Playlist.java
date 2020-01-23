/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.javastart.playlist;

import java.time.Duration;

/**
 *
 * @author ET4
 */
public class Playlist {
    private static final int SECONDS_IN_HOUR=3600;
    private static final int SECONDS_IN_MIN=60;

    public static int playlistLenght(Song... song) {
        int totalTime = 0;
        for (Song song1 : song) {
            totalTime += song1.getTime();
        }
        return totalTime;
    }
    
    public static void getFormattedTime(int seconds){
        
        Duration duration = Duration.ofSeconds(seconds);
        int hours = duration.toHoursPart();
        int min = duration.toMinutesPart();
        seconds=duration.toSecondsPart();
        System.out.println(hours+" "+min+" "+seconds);
       
    }

}
