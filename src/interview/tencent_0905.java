package interview;

import com.sun.jdi.ShortType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class tencent_0905 {
    public ListNode solve (ListNode[] a) {
        // write code here
        int length = a.length;
        int nullCount = 0;
        for(int i = 0; i < length; ++i){
            if(a[i] == null){
                nullCount += 1;
            }
        }

        ListNode head = new ListNode(0);
        ListNode tail = head;

        while(nullCount != length){
            for(int i = 0; i < length; i++){
                if(a[i] != null){
                    tail.next = a[i];
                    a[i] = a[i].next;
                    if(a[i] == null) nullCount += 1;
                    tail = tail.next;
                }
            }
        }
        return head.next;

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x;
        int[] sortedA = new int[n];
        int[] sortedB = new int[n];
        for(int i = 0; i < n; i++){
            x = sc.nextInt();
            sortedA[i] = getPower(x);
        }
        for(int i = 0; i < n; i++){
            x = sc.nextInt();
            sortedB[i] = getPower(x);
        }
        Arrays.sort(sortedA);
        Arrays.sort(sortedB);
        int indexA = n - 1;
        int indexB = n - 1;
        int res = 0;
        while(indexA >= 0 && indexB >= 0){
            if(sortedB[indexB] > sortedA[indexA]){
                res += 1;
                indexA -= 1;
                indexB -= 1;
            }
            else{
                indexA -= 1;
            }
        }
        System.out.println(res);
    }

    private static int getPower(int num){
        int power = 0;
        if(num == 1) return 1;
        int square = (int)Math.floor(Math.sqrt(num));
        for(int i = 1; i <= square; i++){
            if(num % i == 0){
                power += 2;
            }
        }
        if(num == square * square) power -= 1;
        return power;
    }
}


// 本题为考试多行输入输出规范示例，无需提交，不计分。
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int iterationNum = 0;
        int temp = n;
        while(temp >= 2){
            temp = temp/2;
            iterationNum += 1;
        }
        int iter = 0;
        List<Byte> res = new ArrayList<>();
        res.add((byte)n);
        byte cur = 0;
        while(iter < iterationNum){
            List<Byte> nextArray = new ArrayList<>();

            for(int i = 0; i < res.size(); i++){
                cur = res.get(i);
                if(res.get(i) > 1){
                    nextArray.add((byte) (cur/2));
                    nextArray.add((byte) (cur%2));
                    nextArray.add((byte) (cur/2));
                }else{
                    nextArray.add(cur);
                }
            }
            res = nextArray;
            iter++;
        }
        int ans = 0;
        for(int i = l - 1; i < r; i++){
            if(res.get(i) == 1) ans += 1;
        }
        System.out.println(ans);
    }
}