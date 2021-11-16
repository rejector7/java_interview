package interview;

import java.util.Scanner;

public class renshou_1109_ran {

}

//Problem3
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int K = sc.nextInt();
//        int[] cost = new int[N + 1];
//        int[] tax = new int[N + 1];
//        int[] costSum = new int[N + 1];
//        int[] taxSum = new int[N + 1];
//        for(int i = 0; i < N; i++){
//            cost[i + 1] = sc.nextInt();
//            costSum[i + 1] = cost[i + 1] + costSum[i];
//        }
//        for(int i = 0; i < N; i++){
//            tax[i] = sc.nextInt();
//            taxSum[i + 1] = tax[i] + taxSum[i];
//        }
//        int[] dp = new int[N + 1];
//
//        for(int i = 1; i <= N; i++){
//            dp[i] = Integer.MAX_VALUE;
//            for(int j = Math.max(0, i - K); j < i; j++){
//                dp[i] = Math.min(dp[i], dp[j] + Math.max(costSum[i] - costSum[j], tax[i - 1]) + taxSum[i - 1] - tax[j]);
//            }
//        }
//
//        System.out.println(dp[N]);
//    }
//}
