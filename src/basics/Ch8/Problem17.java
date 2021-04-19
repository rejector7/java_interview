package basics.Ch8;
import static util.Print.*;

class Cycle{
    public Cycle(){
        println("Cycle construction.");
    }
}

class Unicycle extends Cycle{
    public Unicycle() {
        println("Unicycle construction.");
    }
    public void balance(){
        println("Unicycle balance");
    }
}

class Bicycle extends Cycle{
    public Bicycle(){
        println("Bicycle construction");
    }
}

public class Problem17 {
    public static void main(String[] args){
        Cycle[] cycles = {new Unicycle(), new Bicycle()};
        ((Unicycle)cycles[0]).balance();
//        ((Bicycle)cycles[1]).balance();   // no balance method
    }
}
