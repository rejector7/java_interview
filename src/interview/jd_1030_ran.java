package interview;
import javase.multithreading.*;

import java.util.Scanner;

public class jd_1030_ran {
    public static void main(String[] args) {
        int i = 2;
        System.out.println(i > 2 ? 99.9 : 9);
    }
}

//Problem04
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int[][] loss = new int[n][n];
//        int a, b, c;
//        int max = 0, secondMax = 0;
//        int maxIndexOne = 0, maxIndexTwo = 0;
//        int secMaxIndexOne = 0, secMaxIndexTwo = 0;
//
//        for(int i = 0; i < m; i++){
//            a = sc.nextInt();
//            b = sc.nextInt();
//            c = sc.nextInt();
//            loss[a][b] = loss[b][a] = c;
//            if( c > max ){
//                secMaxIndexOne = maxIndexOne;
//                secMaxIndexTwo = maxIndexTwo;
//                secondMax = max;
//                max = c;
//                maxIndexOne = a;
//                maxIndexTwo = b;
//            } else if ( c > secondMax ){
//                secondMax = c;
//                secMaxIndexOne = a;
//                secMaxIndexTwo = b;
//            }
//        }
//
//
//
//    }
//
//    private static int getLoss()
//}