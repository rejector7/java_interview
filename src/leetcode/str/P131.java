package leetcode.str;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ruanjinteng
 * @version 20210719
 *
 * 思路1：动态规划
 */
public class P131 {
    class Solution {
        private boolean check(String s){
            for(int i = 0; i < s.length()/2; i++){
                if(s.charAt(i) != s.charAt(s.length()-i-1)) {
                    return false;
                }
            }
            return true;
        }
        public List<List<String>> partition(String s) {
            List<List<List<String>>> indexedRes = new ArrayList<>();
            indexedRes.add(new ArrayList<>());
            int i = 1;
            while(i++ < s.length()){
                char cur = s.charAt(i);
                List<List<String>> curList = new ArrayList<>();
                List<List<String>> preList = indexedRes.get(i-1);
                for(List<String> temp:preList){
                    List<String> curTemp;
                    curTemp = temp.add(String.valueOf(s.charAt(i));
                    curList.add(curTemp);
                }
            }
        }
    }
}
