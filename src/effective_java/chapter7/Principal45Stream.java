package effective_java.chapter7;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.System.*;

public class Principal45Stream {
    public static void main(String[] args) {
        // stream source

        // from collection
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        Stream<String> s1 = strings.stream();

        // from array
        IntStream s2 = Arrays.stream(new int[]{1, 2, 3});

        // from values
        Stream<Integer> s3 = Stream.of(1, 2, 3);

        // from function: iterate & generate
        Stream<Integer> s4 = Stream.iterate(0, i -> i);
        Stream<Integer> s5 = Stream.generate(() -> 1);

        //intermediate operations





        List<String> filtered = strings.stream().filter(s -> s.length() != 0).collect(Collectors.toList());
        out.println(filtered);
        Stream<String> stringStream= strings.stream();
        out.println(stringStream.collect(Collectors.toList()));
//        out.println(stringStream.collect(Collectors.joining(" "))); //wrong ,no consumed more than once.

    }
}
