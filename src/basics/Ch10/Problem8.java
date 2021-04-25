package basics.Ch10;
import static util.Print.*;

public class Problem8 {
    public static void main(String[] args){
        Outer8 o = new Outer8();
        println(o.getInt());
//        Outer8.Inner8 oi = o.getInner();

    }
}

class Outer8{
    class Inner8{
        private int a = 1;
    }
//    public Inner8 getInner(){
//        return new Inner8();
//    }
    public int getInt(){
        Inner8 i = new Inner8();
        return i.a;
    }
}
