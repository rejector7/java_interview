package leetcode.dp;

public class P70 {
    class Solution {
        public int climbStairs(int n) {
            if(n == 1){
                return 1;
            }
            if(n == 2){
                return 2;
            }
            int pre2 = 1;
            int pre1 = 2;
            int cur = 3;
            int res = 0;
            while(cur++ <= n){
                res = pre1 + pre2;
                pre2 = pre1;
                pre1 = res;
            }
            return res;
        }
    }
}
