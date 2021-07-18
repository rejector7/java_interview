package leetcode.array;

/**
 * 获取最小的缺失正整数。
 * O（n）并且常数空间的限制。
 * 没有空间限制的正常思路是：利用哈希集合来存储，然后从1开始遍历。
 * 原地利用数组存储的方式是，把每个数字存储在对应下标的位置，相当于O（1）的哈希集合。
 * 遍历集合，交换位置。数值a应该存在下标为a-1的地方。
 * 注意：temp-1
 */
public class P41 {
    class Solution {
        public int firstMissingPositive(int[] nums) {
            int length = nums.length;
            int temp;
            int temp2;
            int i = 0;
            while(i<length){
                temp = nums[i];
                while(temp<=length && temp >=1){
                    temp2 = nums[temp-1];
                    nums[temp-1] = temp;
                    if(temp == temp2){
                        break;
                    }
                    temp = temp2;
                }
                i++;
            }
            for (int j = 0; j < length; j++){
                if(nums[j] != j + 1){
                    return j + 1;
                }
            }
            return length + 1;
        }
    }
}
