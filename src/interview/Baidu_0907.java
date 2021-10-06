package interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Baidu_0907 {

}

// 本题为考试多行输入输出规范示例，无需提交，不计分。
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[][] nums = new int[N][N];
        int[][] ans = new int[N*K][N*K];
        int x;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                x = sc.nextInt();
                nums[i][j] = x;
                for(int m = i * K; m < i * K + K; m++){
                    for(int n = j * K; n < j * K + K; n++){
                        ans[m][n] = x;
                    }
                }
            }
        }

        for(int i = 0; i < N * K; i++) {
            for (int j = 0; j < N * K; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}


// 本题为考试多行输入输出规范示例，无需提交，不计分。
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[] nums = new String[T];
        String[] ans = new String[T];
        for(int i = 0; i < T; i++){
            nums[i] = sc.next();
            ans[i] = getPerfectNum(nums[i]);
            System.out.println(ans[i]);
        }
    }

    private static String getPerfectNum(String numStr){
        String res = numStr.replaceAll("[0456789]", "3");

        long resInt = Long.parseLong(res);
        if(resInt > Long.parseLong(numStr)){
            int first = Integer.parseInt(String.valueOf(numStr.charAt(0))) - 1;
            if(first > 0){
                res = String.valueOf(first) + res.substring(1);
            }
            else{
                res = res.substring(1);
            }
        }
        return res;
    }
}