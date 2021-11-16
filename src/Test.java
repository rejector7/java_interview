import javax.management.timer.Timer;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.concurrent.*;

public class Test {
    private int i;
    public Test(int i) {
        this.i = i;
        System.out.println(i);
    }
    public static Test t1 = new Test(1);
//    public static Test t2 = new Test(2);
    {
        System.out.println("gou" + i);
    }
    static {
        System.out.println("jin");
    }
    public static void main(String[] args) {
//        Test t = new Test(3);
    }
}

class T implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(1);
    }
}
