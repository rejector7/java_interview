package interview;

import java.util.*;

import java.util.Scanner;


/**
 * 无限集合。
 * 应该多加，少乘。保证同大小增长。
 * 判断是否等于q。
 * 而不是同次数增长。
 */
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//        int [][] nums = new int[T][4];
//        for(int i = 0; i < T; i++){
//            for(int j = 0; j < 4; j++){
//                nums[i][j] = sc.nextInt();
//            }
//        }
//        int[] res = new int[T];
//        for(int i =0;i<T; i++){
//            if(belong(nums[i])){
//                res[i] = 1;
//            }else{
//                res[i] = 0;
//            }
//        }
//        for(int i =0;i<T; i++){
//            System.out.println(res[i]);
//        }
//
//    }
//
//    private static boolean belong(int[] nums) {
//        int a = nums[0];
//        int b = nums[1];
//        int c = nums[2];
//        int q = nums[3];
//
//        List<Integer> updatedSet = new ArrayList<>();
//        updatedSet.add(a);
//        int loop = 0;
//        int curMax = 0;
//        int temp1;
//        int temp2;
//        while(loop++ < 50 && curMax < q){
//            List<Integer> preSet = new ArrayList<>(updatedSet);
//            updatedSet = new ArrayList<>();
//            for(int i = 0; i< preSet.size() - 1; i++){
//                temp1 = preSet.get(i) + b;
//                temp2 = preSet.get(i) * c;
//                if(temp1 == q || temp2 == q){
//                    return true;
//                }
//                updatedSet.add(temp1);
//                updatedSet.add(temp2);
//            }
//            temp1 = preSet.get(preSet.size() - 1) + b;
//            temp2 = preSet.get(preSet.size() - 1) * c;
//            if(temp1 == q || temp2 == q){
//                return true;
//            }
//            updatedSet.add(temp1);
//            updatedSet.add(temp2);
//            curMax = Math.max(temp1, temp2);
//        }
//        return false;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [][] nums = new int[2][n];
//        for(int i = 0; i < 2; i++){
//            for(int j = 0; j < n; j++){
//                nums[i][j] = sc.nextInt();
//            }
//        }
//
//        Set<Integer> deskNums = new HashSet<>();
//        Stack<Integer> deskStack = new Stack<>();
//        int a = 0;
//        int b = 0;
//        int chickSum = 0;
//        int duckSum = 0;
//        int cur_num = 0;
//        int temp = 0;
//        while(a < n || b < n){
//            while(a < n && deskNums.contains(nums[0][a])){
//                cur_num = nums[0][a];
//                while(deskStack.peek() != cur_num){
//                    temp = deskStack.pop();
//                    deskNums.remove(temp);
//                    chickSum += 1;
//                }
//                deskNums.remove(cur_num);
//                deskStack.pop();
//                chickSum = chickSum + 2;
//                a++;
//            }
//            if(a < n){
//                deskNums.add(nums[0][a]);
//                deskStack.push(nums[0][a]);
//                a++;
//            }
//
//            while(b < n && deskNums.contains(nums[1][b])){
//                cur_num = nums[1][b];
//                while(deskStack.peek() != cur_num){
//                    temp = deskStack.pop();
//                    deskNums.remove(temp);
//                    duckSum += 1;
//                }
//                deskNums.remove(cur_num);
//                deskStack.pop();
//                duckSum += 2;
//                b++;
//            }
//            if(b < n){
//                deskNums.add(nums[1][b]);
//                deskStack.push(nums[1][b]);
//                b++;
//            }
//        }
//
//        while(!deskStack.empty()){
//            if(deskStack.peek() % 2 == 1){
//                deskStack.pop();
//                chickSum += 1;
//            }else {
//                deskStack.pop();
//                duckSum += 1;
//            }
//        }
//        System.out.print(chickSum);
//        System.out.print(" ");
//        System.out.print(duckSum);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] points = new int[n][2];
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < 2; j++){
//                points[i][j] = sc.nextInt();
//            }
//        }
//        Arrays.sort(points, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o1[0] - o2[0];
//            }
//        });
//        int maxRight = Integer.MIN_VALUE;
//        for(int i =0; i< n; i++){
//            if(points[i][1] <= maxRight){
//                System.out.println("true");
//                return;
//            }
//            maxRight = points[i][1];
//        }
//        System.out.println("false");
//        return;
//    }
//}

public class pdd0725 {

}

