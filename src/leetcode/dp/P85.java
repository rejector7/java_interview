package leetcode.dp;

import java.util.Arrays;
import java.util.Stack;

/***
 * hard： similar to P84
 * 转化为柱形：最大矩形。
 * 转化方式：以每行为底部，该行往上的列作为柱形。
 * 遍历 m 行 次。
 *
 * bug点：
 * 每行之间比较的是高度。高度要从heights数组中获取。
 */
public class P85 {
    class Solution {
        public int maximalRectangle(char[][] matrix) {
            int m = matrix.length;
            if(m == 0){
                return 0;
            }
            int n = matrix[0].length;
            //第 0 行，属于哨兵。
            int[][] heights= new int[m + 1][n];
            for(int i = 0; i < m + 1; i++){
                Arrays.fill(heights[i], 0);
            }
            // get heights array
            for(int j = 0; j < n; ++j){
                for(int i = 1; i <= m; ++i){
                    heights[i][j] = matrix[i - 1][j] == '1' ? heights[i - 1][j] + 1: 0;
                }
            }
//            for(int i = 0; i< m+1; i++){
//                for(int j = 0; j< n; j++){
//                    System.out.print(heights[i][j]);
//                }
//                System.out.println();
//            }
            Stack<Integer> mono_stack = new Stack<>();
            int[] left = new int[n];
            int[] right = new int[n];
            int res = 0;
            int[][] ans = new int[m][n];
            for(int i = 1; i <= m; ++i){
//                System.out.println(Arrays.toString(left));
//                System.out.println(Arrays.toString(right));
//                Arrays.fill(left, -1);
//                Arrays.fill(right, n);
                mono_stack.clear();
                for(int j = 0; j < n; ++j){
                    while(!mono_stack.empty() && heights[i][mono_stack.peek()] >= heights[i][j]){
                        right[mono_stack.peek()] = j;
                        mono_stack.pop();
                    }
                    left[j] = mono_stack.empty()? -1: mono_stack.peek();
                    mono_stack.push(j);
                }
                for(int j = 0; j < n; j++){
                    ans[i - 1][j] = heights[i][j] * (right[j] - left[j] - 1);
                    res = Math.max(res, heights[i][j] * (right[j] - left[j] - 1));
                }
            }
//            for(int i = 0; i< m; i++){
//                for(int j = 0; j< n; j++){
//                    System.out.print(ans[i][j]);
//                    System.out.print(' ');
//                }
//                System.out.println();
//            }
            return res;
        }
    }
}
