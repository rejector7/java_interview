package basics.Ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static util.Print.*;

public class Problem7 {
    static class Seven{
        public Seven(){
            int a = 1;
        }
    }

    public static void main(String[] args) {
        List<Seven> l1 = new ArrayList<>(Arrays.asList(new Seven[4]));
        List<Seven> l2 = l1.subList(1, 3);
        if(l1.containsAll(l2)){
            println("contain true");
        }
        println(l2);
        try {
            l1.removeAll(l2);
            println(l1);
        }
        catch (Exception e){
            println(e);
        }

    }
}
