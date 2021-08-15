package leetcode.hashmap;

public class P41 {
    class Solution {
        public int firstMissingPositive(int[] nums) {
            int n = nums.length;
            int temp;
            int targetValue;
            for(int i = 0; i < n; ++i){
                targetValue = nums[i];
                if(targetValue != i + 1){
                    while(targetValue <= n && targetValue >= 1 && nums[targetValue - 1] != targetValue){
                        temp = nums[targetValue - 1];
                        nums[targetValue - 1] = targetValue;
                        targetValue = temp;
                    }
                }
            }
            for(int i = 0; i < n; ++i){
                if(nums[i] != i + 1){
                    return i + 1;
                }
            }
            return n + 1;
        }
    }
}
