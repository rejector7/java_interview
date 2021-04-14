package basics.Ch4;
import static java.lang.System.out;

public class Problem9 {
    private final int fibonacciNum;
    public Problem9(int num) {
        this.fibonacciNum = num;
    }
    public void run(){
        int[] numList = new int[this.fibonacciNum];
        if(this.fibonacciNum >= 2){
            numList[0] = 1;
            numList[1] = 1;
        }
        switch (this.fibonacciNum) {
            case 0 -> out.println("NULL");
            case 1 -> out.println(1);
            case 2 -> out.println(1 + " " + 1);
            default -> {
                out.print(numList[0] + " ");
                out.print(numList[1] + " ");
                for (int i = 2; i < this.fibonacciNum; i++) {
                    numList[i] = numList[i - 1] + numList[i - 2];
                    out.print(numList[i] + " ");
                }
            }
        }
    }
}
