package leetcode.dp;

public class P64 {
    class Solution {
        public int minPathSum(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int[] sum = new int[n];
            sum[0] = grid[0][0];
            for(int j = 1; j < n; j++){
                sum[j] = sum[j - 1] + grid[0][j];
            }
            for(int i = 1; i<m; i++){
                for (int j =0; j<n; j++){
                    if(j == 0){
                        sum[j] += grid[i][j];
                        continue;
                    }
                    sum[j] = Math.min(sum[j], sum[j - 1]) + grid[i][j];
                }
            }
            return sum[n-1];
        }
    }
}
