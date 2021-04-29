package basics.Ch11;

import java.util.*;

public class Problem14 {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        List<Integer> data = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ListIterator<Integer> dataIt = data.listIterator();
        ListIterator<Integer> listIt;
        while(dataIt.hasNext()){
            listIt = l.listIterator(l.size()/2);
            listIt.add(dataIt.next());
        }
        util.Print.println(l);
    }
}
