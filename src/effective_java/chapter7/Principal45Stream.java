package effective_java.chapter7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static java.lang.System.*;

public class Principal45Stream {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(s -> s.length() != 0).collect(Collectors.toList());
        out.println(filtered);
    }
}
