package basics.Ch11;

import java.util.*;
import static util.Print.*;

public class Problem11 {
    static void display(Iterator<Integer> it){
        while(it.hasNext()){
            println(it.next());
        }
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        Collection<Integer> c1 = new ArrayList<>(list);
        Collection<Integer> c2 = new HashSet<>(list);
        Collection<Integer> c3 = new TreeSet<>(list);
        Collection<Integer> c4 = new LinkedList<>(list);

        display(c1.iterator());
        display(c2.iterator());
        display(c3.iterator());
        display(c4.iterator());
    }
}
