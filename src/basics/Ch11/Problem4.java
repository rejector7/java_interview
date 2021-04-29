package basics.Ch11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import static util.Print.*;

public class Problem4 {
    static class DataGenerator{
        private String[] data;
        private int length;
        private int index = 0;
        public DataGenerator(){
            data = new String[]{"Snow white", "Star wars"};
            length = data.length;
        }
        public String next(){
            String res = data[index];
            index = (index + 1)%2;
            return res;
        }
    }
    public static Collection<String> fillData(Collection<String> c, int num, Problem4.DataGenerator pd){
        for(int i= 0;i<num; i++){
            c.add(pd.next());
        }
        return c;
    }
    public static void main(String[] args) {
        Problem4.DataGenerator pd = new DataGenerator();
        println(fillData(new ArrayList<>(), 5, pd));
        println(fillData(new HashSet<>(), 6, pd));
        Test t = new Test();
    }
}

class Test{
    Problem4.DataGenerator pd = new Problem4.DataGenerator();
    {
        println(Problem4.fillData(new ArrayList<>(), 5, pd));
        println(Problem4.fillData(new HashSet<>(), 6, pd));
    }
}




