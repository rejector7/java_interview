package leetcode.str;

public class P58 {
    class Solution {
        public int lengthOfLastWord(String s) {
            int res = 0;
            int length = s.length();
            for (int i=length-1; i>=0; i--){
                if(!Character.isLetter(s.charAt(i))){
                    continue;
                }
                else{
                    res += 1;
                    while(i>=1 && Character.isLetter(s.charAt(--i))){
                        res +=1;
                    }
                    return res;
                }
            }
            return res;
        }
    }
}
