package Lesson24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample0 {
    public static void main(String[] args) {
        // JDK 10
//        var list = List.of("one", "two", "three");
        // JDK 9
//        List<String> list = List.of("one", "two", "three");

        // JDK 8
        List<String> list = Arrays.asList("one", "two", "three");

        int len = 0;
        for (String s : list)
            len += s.length();

        System.out.println(len);

        Integer lenght = list.stream()
                .map(s -> s.length())
                .reduce(0,(i1, i2) -> i1 + i2);

        System.out.println(lenght);

        Stream<String> stream = list.stream();

        Stream<Integer> lenStream = stream.map(s -> s.length());

        Integer result = lenStream.reduce(0, (i1, i2) -> i1 + i2);

        Stream<Integer> integerStream = IntStream.range(0,100).boxed();

        integerStream.forEach(System.out::println);
    }
}
