package leetcode.str;


/**
 * @author ruanjinteng
 * @version 20210719
 *
 * 寻找子串算法：KMP
 * 部分匹配表：最长相同前后缀。
 */
public class P28 {
    class Solution {
        private void getMatchTable(int[] next, String s){
            int length = s.length();
            int j = 0; //表示当前不匹配应该要跳转的位置。
            next[0] = 0; //前后缀分别去掉首尾字符后比较匹配。
            for(int i=1; i< length; i++){//next[i]表示，该位置不匹配时，应该跳转到needle的哪个位置。
                while(j > 0 && s.charAt(i) != s.charAt(j)){ //直到j=0，即完全不匹配，从头开始。
                    j = next[j-1];
                }
                if(s.charAt(i) == s.charAt(j)){
                    j++;//匹配，则跳转到 j+1的位置。
                }
                next[i] = j;
            }
        }
        public int strStr(String haystack, String needle) {
            if(needle.length() == 0){
                return 0;
            }
            int[] next = new int[needle.length()];
            getMatchTable(next, needle);
            int j = 0;
            for(int i= 0; i < haystack.length(); i++){
                while(j > 0 && needle.charAt(j) != haystack.charAt(i)){
                    j = next[j-1];
                }
                if(haystack.charAt(i) == needle.charAt(j)){
                    j++;
                }
                if(j == needle.length()){
                    return i - needle.length() + 1;
                }
            }
            return -1;
        }
    }
}
