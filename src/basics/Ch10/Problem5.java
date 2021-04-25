package basics.Ch10;
import static util.Print.*;

public class Problem5 {
    public static void main(String[] args){
        Outer5 o = new Outer5();
        Outer5.Inner5 oi = o.new Inner5();
    }
}

class Outer5{
    public Outer5(){
        println("Outer5 cons");
    }
    class Inner5{
        public Inner5(){
            println("Inner5 cons");
        }
    }
}