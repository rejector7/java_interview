package basics.Ch4;
import java.util.ArrayList;
import java.util.HashSet;
import static java.lang.System.out;

public class Problem10 {
    private final ArrayList<Integer> vampireList = new ArrayList<>();
    private final ArrayList<ArrayList<Integer>> match = new ArrayList<>();
    public Problem10() {
        for (int i = 1; i < 4; i++) {
            ArrayList<Integer> tempArrayList = new ArrayList<>();
            tempArrayList.add(0);
            tempArrayList.add(i);
            this.match.add(tempArrayList);
        }
    }

    private Boolean IsMagic(int target){
        String targetS = Integer.toString(target);
        for (ArrayList<Integer> innerArray: this.match){
            ArrayList<Integer> indexSet = new ArrayList<>();
            indexSet.add(0);
            indexSet.add(1);
            indexSet.add(2);
            indexSet.add(3);
            indexSet.remove(innerArray.get(0));
            indexSet.remove(innerArray.get(1));
            for (int i=0; i<2; i++){
                int num1 = innerArray.get(i);
                int num2 = innerArray.get((i+1)%2);
                int mul1 = Integer.parseInt(targetS.charAt(num1) + "" + targetS.charAt(num2));
                for (int j=0; j<2; j++){
                    int num3 = indexSet.get(j);
                    int num4 = indexSet.get((j+1)%2);
                    int mul2 = Integer.parseInt(targetS.charAt(num3) + "" + targetS.charAt(num4));
                    if(mul2 * mul1 == target){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void run(){
        for (int num = 1000; num < 10000; num++){
            if(this.IsMagic(num)){
                this.vampireList.add(num);
            }
        }
        for (int v: this.vampireList){
            out.println(v + "");
        }
    }
}
