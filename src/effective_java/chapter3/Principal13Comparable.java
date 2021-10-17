package effective_java.chapter3;

import java.util.Arrays;
import java.util.Comparator;

public class Principal13Comparable implements Comparable<Principal13Comparable>{
    private final int phoneNumber;

    public Principal13Comparable(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int compareTo(Principal13Comparable pc){
        return Integer.compare(this.phoneNumber, pc.phoneNumber);
    }

    public String toString(){
        return String.valueOf(this.phoneNumber);
    }

    public static void main(String[] args) {
        Principal13Comparable[] arrayA = new Principal13Comparable[3];
        arrayA[0] = new Principal13Comparable(123);
        arrayA[1] = new Principal13Comparable(234);
        arrayA[2] = new Principal13Comparable(45);
        Arrays.sort(arrayA);
        System.out.println(Arrays.toString(arrayA));

        // anonymous class -> lambda expression -> comparingInt
        Comparator<Principal13Comparable> comparator1 = new Comparator<Principal13Comparable>() {
            @Override
            public int compare(Principal13Comparable o1, Principal13Comparable o2) {
                return Integer.compare(o1.phoneNumber, o2.phoneNumber);
            }
        };
        Comparator<Principal13Comparable> comparator2 = (o1, o2) -> Integer.compare(o1.phoneNumber, o2.phoneNumber);
        Comparator<Principal13Comparable> comparator = Comparator.comparingInt(o -> o.phoneNumber);

        System.out.println(comparator.compare(arrayA[0], arrayA[1]));


    }


}
