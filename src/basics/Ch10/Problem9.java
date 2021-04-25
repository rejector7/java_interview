package basics.Ch10;
import static util.Print.*;

public class Problem9 {
    public Outer9 test(){
        class Inner9 implements Outer9{
            public void run(){
                println("Inner9 run");
            }
        }
        return new Inner9();
    }
    public static void main(String[] args){
        Problem9 p = new Problem9();
        p.test().run();
    }
}

interface Outer9{
    void run();
}


