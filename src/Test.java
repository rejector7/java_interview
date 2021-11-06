import java.util.Comparator;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        Thread t = new Thread(new T());

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
