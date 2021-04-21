package basics.Ch10;
import static util.Print.*;

class Outer{
    private String info;
    public Outer(){
        info = "Outer Construction";
    }
    class Inner{
        void run(){
            println("Inner run");
        }
    }
    public Inner getInner(){
        return new Inner();
    }


}
public class Problem1 {
    public static void main(String[] args){
        Outer o = new Outer();
        Outer.Inner oi = o.getInner();
        oi.run();
    }
}
