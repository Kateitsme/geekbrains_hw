package homework_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task {
    public static void main(String[] args) {
        // 1 задание
        Stream<String> words = Stream.of("mom dad juice orange apple yellow green year gap cap " +
                "cup photo album today seven one two three plant egg " +
                "home work fork nine go id old core tree bee " +
                "calm dark weekend month football tennis movie scene plate plane " +
                "sunday monday tuesday wednesday thursday friday saturday september october november " +
                "shining through the city with a little funk and soul " +
                "home work fork nine go id old core tree bee " +
                "home work fork nine go id old core tree bee " +
                "mom dad juice orange apple yellow green year gap cap " +
                "cup photo album today seven one two three plant egg");
        String reduce = words
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .filter(word -> word.length() > 5)
                .collect(Collectors.joining(" "));
        System.out.println(reduce);
        // 2 задание
        String [][] not_equals= {
                {"shining", "through", "the", "city", "with"},
                {"a", "little", "funk", "and", "soul"},
                {"little", "bird", "today", "sunny", "cold"},
                {"come", "on", "little", "lady", "smile"},
                {"shining", "through", "the", "city", "with"}};
        Arrays.stream(not_equals)
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(System.out::println);
        // 3 задание
        List<Integer> numbers = Arrays.asList(12,12,34,32,323,232,100,140,180);
        Integer three = numbers.stream()
                .filter(value -> value%2==0 && value<=200 && value>=100)
                .mapToInt(value -> Integer.parseInt(String.valueOf(value))).sum();
        System.out.println(three);
        // 4 задание
        List<String> names = new ArrayList<>(Arrays.asList(
                "Dad", "Abel", "Mike", "Sam"));
        Integer four = names.stream()
                .mapToInt(String::length).sum();
        System.out.println(four);
        // 5 задание
        List<String> lines = new ArrayList<>(Arrays.asList(
                "Dad", "Abel", "Mike", "Sam"));
        String five = lines.stream()
                .limit(3)
                .sorted()
                .collect(Collectors.joining(" "));
        System.out.println(five);

    }
}

