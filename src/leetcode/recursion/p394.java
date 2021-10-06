package leetcode.recursion;


/**
 * 方法一： recursion + stack
 *
 * 从左向右，从大到小递归。
 * 每次处理一个用[]包裹的独立字符串
 *
 * 获取独立字符串，需要利用辅助栈
 *
 * 方法二：直接使用辅助栈
 */
public class p394 {
    class Solution {
        public String decodeString(String s) {
            if(s.equals("")) return "";
            Character c = s.charAt(0);
            if(Character.isDigit(c)){
                //循环获取digits 作为数字。

            }else if(Character.isLetter(c)){
                //循环获取字母，知道遇到数字
            }
            //
            return "";
        }
    }
}
