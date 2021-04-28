package basics.Ch11;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import static util.Print.*;

public class Problem2 {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        for (int i =0; i< 10;i++){
            s.add(i);
        }
        for (Integer i: s){
            print(i + " ");
        }
    }
}
