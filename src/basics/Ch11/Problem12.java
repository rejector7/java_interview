package basics.Ch11;

import java.util.*;
import static util.Print.*;

public class Problem12 {
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>(Arrays.asList(1, 2, 3));
        ListIterator<Integer> it = l.listIterator(l.size());
        List<Integer> l2 = new ArrayList<>();
        while(it.hasPrevious()){
            l2.add(it.previous());
        }
        println(l2);
    }
}
