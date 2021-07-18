package leetcode.array;

import java.util.Arrays;

/**
 * 获取所有排列中，当前排列字典序的下一个排列。
 * 思路：从后往前遍历，得到最短的非完全倒序的子序列。
 * 将第一个数字和与它最接近的大于它的数字交换，剩下的数有序排列即可。
 */
public class P31 {
    class Solution {
        public void nextPermutation(int[] nums) {
            int sz = nums.length;
            int begin = -1;
            for (int i = sz-1; i>=1; i--){
                if(nums[i] <= nums[i-1]){
                }
                else{
                    begin = i-1;
                    break;
                }
            }
            if(begin == -1){
                Arrays.sort(nums);
                return;
            }
            for (int j = sz - 1; j>=begin + 1; j--){
                if(nums[j] > nums[begin]){
                    int temp = nums[j];
                    nums[j] = nums[begin];
                    nums[begin] = temp;
                    Arrays.sort(nums, begin+1, sz);
                    return;
                }
            }
        }
    }
}
