package interview;

import java.util.HashMap;
import java.util.Scanner;

public class yuewen_1021_ran {
}

//import java.util.Scanner;
//public class Main {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int N = sc.nextInt();
////
////    }
//    public boolean isSameTree (TreeNode p, TreeNode q){
//        if(p == null && q == null){
//            return true;
//        }
//        if(p!= null && q != null){
//            if(p.val != q.val) return false;
//            else{
//                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
//            }
//        }
//        return false;
//    }
//}
//
//class TreeNode {
//    int val = 0;
//    TreeNode left;
//    TreeNode right;
//}
//
//
//
//public class Main {
//    //    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int N = sc.nextInt();
////
////    }
//    public int findLucky (int[] arr){
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        int tempCount;
//        for(int num: arr){
//            tempCount = hashMap.getOrDefault(num, 0);
//            tempCount += 1;
//            hashMap.put(num, tempCount);
//        }
//        int res = -1;
//        for(int i : hashMap.keySet()){
//            if(i == hashMap.get(i) && i > res){
//                res = i;
//            }
//        }
//        return res;
//    }
//}
