package homework_8;

import java.util.HashSet;
import java.util.Set;

import java.util.*;

public class Task_1 {
    public static Map<String, Integer> wordCount(List<String> words) {
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.merge(word, 1, Integer::sum);
        }

        return wordCount;
    }

    public static void main(String[] args) {
        System.out.println(wordCount(Arrays.asList("Nirvana", "twice", "bts", "Beatles", "Queen",
                "Coldplay", "Halsey", "Imagine Dragons", "Beatles", "Coldplay",
                "AC/DC", "Madonna", "Eminem", "Ariana Grande", "BlackPink",
                "Nirvana", "Eminem", "Halsey", "Nirvana", "Beatles")));
    }
}
