package basics.Ch6.Problem8;
import static util.Print.*;

public class Singleton {
    private Singleton(){println("Singleton Construction");}
    private static final Singleton s = new Singleton();
    public static Singleton getSingleton(){
        return s;
    }
    public void run(){
        println("Singleton Run");
    }
}


