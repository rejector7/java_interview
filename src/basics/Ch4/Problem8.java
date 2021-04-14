package basics.Ch4;
import static java.lang.System.out;

public class Problem8 {
    public Problem8() {
    }
    public void run(){
        for(int i = 0; i < 5; i++){
            switch (i) {
                case 0 -> System.out.println(0);
                case 1 -> System.out.println(1);
                case 2, 3 -> System.out.println(2 + " " + 3);
                default -> System.out.println("last case or default");
            }
        }
    }
}
