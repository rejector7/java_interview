package leetcode.str;

import java.util.ArrayList;
import java.util.List;

/**
 * 回溯。
 * 深度优先搜索：
 * 1。 退出条件。
 * 2。 临时结果的压入/弹出。
 */
public class P93 {
    class Solution {
        List<String> res = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        String temp;
        public List<String> restoreIpAddresses(String s) {
            int n = s.length();
            dfs(s, 4);
            return res;
        }

        private void dfs(String s, int num){
            if(num >= 1 && s.length() < 1){
                return;
            }
            if(num == 1 && ( s.length() >= 4 || !String.valueOf(Integer.parseInt(s)).equals(s) || Integer.parseInt(s) > 255)){
                return;
            }
            if(num == 1){
                ans.add(s);
                temp = String.join(".", ans);
                res.add(temp);
                ans.remove(ans.size() - 1);
                return;
            }
            for(int leng = 1; leng <=3; leng++){
                if(leng <= s.length()) {
                    String cur = s.substring(0, leng);
                    if(!String.valueOf(Integer.parseInt(cur)).equals(cur) || Integer.parseInt(cur) > 255){
                        continue;
                    }
                    ans.add(s.substring(0, leng));
                    dfs(s.substring(leng), num - 1);
                    ans.remove(ans.size() - 1);
                }
            }
        }
    }
}
