package leetcode.dp;


/**
 * 返回解码方法的总数。
 * 如果是需要列举所有的可能：利用回溯。
 * 如果只是总数，dp会方便一些。
 */
public class P91 {
    class Solution {
        public int numDecodings(String s) {
            int res = 0;
            int length = s.length();
            if(length == 1){
                return lenOne(s.substring(0, 1)) ? 1 : 0;
            }
            int minus2 = lenOne(s.substring(0, 1)) ? 1 : 0;

            int temp = lenOne(s.substring(1, 2)) ? 1 : 0;
            int minus1 = lenTwo(s.substring(0, 2)) ? 1 + minus2 * temp : minus2 * temp;

            if (length == 2){
                return minus1;
            }

            int cur = 3;
            while(cur++ <= length){
                res = 0;
                if(lenOne(s.substring(cur - 1, cur))){
                    res += minus1;
                }
                if(lenTwo(s.substring(cur - 2, cur))){
                    res += minus2;
                }
                minus1 = res;
                minus2 = minus1;
            }
            return res;
        }

        private boolean lenOne(String s){
            return !s.equals("0");
        }

        private boolean lenTwo(String s){
            if(s.charAt(0) == '0'){
                return false;
            }
            return Integer.parseInt(s) <= 26;
        }
    }
}
