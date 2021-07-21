package leetcode.str;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 *
 * @author ruanjinteng
 * @version 20210719
 *
 * 思路1：动态规划
 *
 *
 * 回溯 + 动态规划。主要算法不是动态规划。
 * 回溯：
 * 不断判断子串是否回文，对剩下的字符串进行判断。
 * 判断结束，记得将该子串弹出结果集。
 */
public class P131 {
    class Solution {
        boolean[][] matrix;
        List<List<String>> res = new ArrayList<>();
        List<String> ans = new ArrayList<>();

        public List<List<String>> partition(String s) {
            int length = s.length();
            matrix = new boolean[length][length];

            for(int i = 0; i < length; i++){
                Arrays.fill(matrix[i], true);
            }

            for(int i = length-1; i >= 0; i--){
                for(int j = i + 1; j < length; j++){
                    matrix[i][j] = (s.charAt(i) == s.charAt(j)) && matrix[i + 1][j - 1];
                }
            }

            dfs(s, 0);
            return res;
        }

        private void dfs(String s, int i){
            if(i == matrix.length){
                // why here have to new
                // because ans is an object, and would be changed afterwards.
                // so we need new an object
                res.add(new ArrayList<String>(ans));
                return;
            }
            for(int j = i; j < matrix.length; j++){
                if(matrix[i][j]){
                    ans.add(s.substring(i, j+1));
                    dfs(s, j + 1);
                    ans.remove(ans.size() - 1);
                }
            }
        }
    }
}
