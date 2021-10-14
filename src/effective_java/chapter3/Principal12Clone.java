package effective_java.chapter3;

import java.util.Arrays;

public class Principal12Clone implements Cloneable{
    private int num;
    private int[] a;
    private int[] b;
    public Principal12Clone(int num, int[] arrayA, int[] arrayB){
        this.num = num;
        this.a = arrayA.clone();
        this.b = arrayB.clone();
    }

    public Principal12Clone clone(){
        try{
            Principal12Clone result = (Principal12Clone) super.clone();
            result.a = this.a.clone();
            return result;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        Principal12Clone pc = new Principal12Clone(10, new int[]{1, 2, 3}, new int[]{4, 5, 6});
        Principal12Clone pc2 = pc.clone();
        System.out.println(pc.num == pc2.num);
        System.out.println(pc.a == pc2.a);
        System.out.println(pc.b == pc2.b);
        System.out.println(Arrays.toString(pc.a));
        System.out.println(Arrays.toString(pc2.a));
        pc2.a[0] = 2;
        pc2.b[0] = 2;
        System.out.println(Arrays.toString(pc.a));
        System.out.println(Arrays.toString(pc2.a));
        System.out.println(Arrays.toString(pc.b));
        System.out.println(Arrays.toString(pc2.b));
    }
}
