package leetcode.dp;


import java.util.Stack;

/**
 * hard
 * 单调栈。
 * 哨兵。
 */
public class P84 {
    class Solution {
        public int largestRectangleArea(int[] heights) {
            int n = heights.length;
            int[] left = new int[n];
            int[] right = new int[n];
            Stack<Integer> mono_stack = new Stack<>();
            for(int i = 0; i < n; i++){
                while(!mono_stack.empty() && heights[mono_stack.peek()] >= heights[i]){
                    mono_stack.pop();
                }
                left[i] = mono_stack.empty()? -1: mono_stack.peek();
                mono_stack.push(i);
            }
            mono_stack.clear();
            for(int i = n - 1; i >= 0; i--){
                while(!mono_stack.empty() && heights[mono_stack.peek()] >= heights[i]){
                    mono_stack.pop();
                }
                right[i] = mono_stack.empty()? n: mono_stack.peek();
                mono_stack.push(i);
            }
            int res = 0;
            for(int i = 0; i < n; i++){
                res = Math.max((right[i] - left[i] - 1) * heights[i], res);
            }
            return res;
        }
    }
}
