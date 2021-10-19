package effective_java.chapter7;

import java.util.*;

public class Principal42Lambda {
    public static void main(String[] args) {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        };
        List<String> words = new ArrayList<>();
        words.add("1234");
        words.add("234");
        Collections.sort(words, comparator);
        System.out.println(words);

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1, 2);
        hashMap.put(2, 4);
//        hashMap.merge(key, 1, (count, incr) -> count + incr);
        hashMap.merge(2, 1, Integer::sum);
        System.out.println(hashMap);
    }
}
