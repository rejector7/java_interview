package basics.Ch10;

import static util.Print.println;

public class Problem16 {
    public static void CycleTest(CycleFactory cf){
        Cycle c = cf.getCycle();
        c.ride();
    }
    public static void main(String[] args){
        CycleTest(Unicycle.fact);
        CycleTest(Bicycle.fact);
        CycleTest(Tricycle.fact);
    }
}



interface Cycle{
    void ride();
}

interface CycleFactory{
    Cycle getCycle();
    // multiple methods cannot be simplified to lambda or method reference.
}


class Unicycle implements Cycle {
    public void ride(){println("Unicycle");}
    public static CycleFactory fact = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Unicycle();
        }
    };
}

class Bicycle implements Cycle {
    public void ride(){println("Bicycle");}
    public static CycleFactory fact = Bicycle::new;
}

class Tricycle implements Cycle {
    public void ride(){println("Tricycle");}
    public static CycleFactory fact = Tricycle::new;
}


