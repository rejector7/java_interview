package basics.Ch9;
import static util.Print.*;


interface Cycle{
    void ride();
}

class Unicycle implements Cycle{
    public void ride(){println("Unicycle");}
}

class Bicycle implements Cycle{
    public void ride(){println("Bicycle");}
}

class Tricycle implements Cycle{
    public void ride(){println("Tricycle");}
}

interface CycleFactory{
    Cycle getCycle();
}

class UnicycleFactory implements CycleFactory{
    public Cycle getCycle(){
        return new Unicycle();
    }
}

class BicycleFactory implements CycleFactory{
    public Cycle getCycle(){
        return new Bicycle();
    }
}

class TricycleFactory implements CycleFactory{
    public Cycle getCycle(){
        return new Tricycle();
    }
}



public class Problem18 {
    public static void CycleTest(CycleFactory cf){
        Cycle c = cf.getCycle();
        c.ride();
    }
    public static void main(String[] args){
        CycleTest(new UnicycleFactory());
        CycleTest(new BicycleFactory());
        CycleTest(new TricycleFactory());
    }
}
