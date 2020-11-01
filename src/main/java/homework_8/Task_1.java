package homework_8;

import java.util.HashSet;
import java.util.Set;

import java.util.*;

public class Task_1 {
    public static void main(String[] args){
        List<String> artists = Arrays.asList(
                "Nirvana", "twice", "bts", "Beatles", "Queen",
                "Coldplay", "Halsey", "Imagine Dragons", "Beatles", "Coldplay",
                "AC/DC", "Madonna", "Eminem", "Ariana Grande", "BlackPink",
                "Nirvana", "Eminem", "Halsey", "Nirvana", "Beatles"
        );

        System.out.println(artists.toString());
        Set<String> unique = new HashSet<String>(artists);

        System.out.println("Уникальные артисты");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости");
        for (String artist : unique) System.out.println(artist + ": " + Collections.frequency(artists, artist));


    }
}
