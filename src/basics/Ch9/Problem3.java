package basics.Ch9;
import static util.Print.*;

abstract class Base{
    public Base(){
        println("Base Construction.");
        print();
    }
    public abstract void print();
}

class Derived extends Base{
    private int a = 1;  // if final, then must be initialized before used in print function.
    public Derived(){
        println("Derived Construction.");
    }
    public void print(){
        println("Derived print field a = " + a);
    }
}

public class Problem3 {
    public static void main(String[] args){
        Derived d = new Derived();
        d.print();
    }
}
