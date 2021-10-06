package leetcode.math;

/**
 * 除法：
 * 递归 + 位运算
 */
public class P29 {
    class Solution {
        public int divide(int dividend, int divisor) {
            if(dividend == 0) return 0;
            if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
            boolean negative = (dividend ^ divisor) < 0;
            long a = Math.abs((long)dividend);
            long b = Math.abs((long)divisor);
            int bits = 0;
            if(a < b) return 0;
            while(b << bits <= a){
                bits++;
            }
            int remain = (int)(a - (b << (bits - 1)));
            // System.out.println(remain);
            int res = (1 << (bits - 1)) + divide(remain, Math.abs(divisor));
            return negative ? -res: res;
        }
    }
}
