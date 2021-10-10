package interview;

import java.util.Scanner;

public class dianxin_1009_ran {

}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int realH, realM;
        if(m == 0){
            if(h == 0){
                realH = realM = 0;
            }else{
                realH = 12 - h;
                realM = 0;
            }
        } else {
            realH = 11 - h;
            realM = 60 - m;
        }
        System.out.println(realH + " " + realM);
    }
}


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int n = sc.nextInt();
        int[] valuesT = new int[n];
        int[] valuesC = new int[n];
        for(int i = 0; i < n; i++){
            valuesT[i] = sc.nextInt();
        }
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            valuesC[i] = sc.nextInt();
        }
        int[][] dp = new int[n + 1][T + 1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= T; j++){
                if(j >= valuesC[i - 1]){
                    dp[i][j] = Math.max(dp[i - 1][j], valuesT[i - 1] + dp[i - 1][j - valuesC[i - 1]]);
                }else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println(dp[n][T]);
    }
}