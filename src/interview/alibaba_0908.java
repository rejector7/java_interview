package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class alibaba_0908 {
}

// 本题为考试多行输入输出规范示例，无需提交，不计分。
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[][] nums = new long[t][2];
        long[] ans = new long[t];
        long n;
        int k;
        String temp;
        for(int i = 0; i < t; i++){
            n = sc.nextLong();
            k = sc.nextInt();
            temp = Long.toString(n, k);
            ans[i] = Long.parseLong(new StringBuffer(temp).reverse().toString(), k);
            System.out.println(ans[i]);
        }
    }
}

// 本题为考试多行输入输出规范示例，无需提交，不计分。
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] nums = new int[t][2];
        int n, m;
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < t; i++){
            nums[i][0] = sc.nextInt();
            nums[i][1] = sc.nextInt();

            res = getAns(nums[i][0], nums[i][1]);
            if(res.get(0) == 1){
                System.out.print("V ");
            }else {
                System.out.print("H ");
            }
            System.out.println(res.get(1));
        }

    }
    private static List getAns(int n, int m){
        List<Integer> res = new ArrayList<>();

        int[][] matrix = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = i * m + j + 1;
            }
        }

        int isCol = 1;
        int index = m + 1;
        int left = (1 + m * n) * (m * n) / 2;
        int right = 0;
        int diff = Math.abs(right - left);
        int colSum = 0;
        for(int i = m - 1; i >= m/2 - 1 && i >= 0; i--){
            colSum = 0;
            for(int j = 0; j < n; j++){
                colSum += matrix[j][i];
            }
            left -= colSum;
            right += colSum;
            if(Math.abs(right - left) <= diff){
                diff = Math.abs(right - left);
                index = i + 1;
            }
        }
        int down = (1 + m * n) * (m * n) / 2;
        int up = 0;
        int rowDiff;
        int rowSum = 0;
        for(int i = n - 1; i >= n/2 - 1 && i >= 0; i--){
            rowSum = 0;
            for(int j = 0; j < m; j++){
                rowSum += matrix[i][j];
            }
            down -= rowSum;
            up += rowSum;
            if(Math.abs(down - up) < diff){
                diff = Math.abs(down - up);
                isCol = 0;
                index = i + 1;
            }
        }
        res.add(isCol);
        res.add(index);
        return res;
    }
}