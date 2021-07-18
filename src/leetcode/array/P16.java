package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.out;

/**
 *  不能使用 nums[i] + nums[j]作为条件，因为可能连续的两个判断i和j会发生改变。
 */
public class P16 {
    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            int closet = Integer.MAX_VALUE;
            int sz = nums.length;
            Arrays.sort(nums);
            int newTarget;
            for(int last = sz - 1; last >= 2; last--){
                int i = 0;
                int j = last - 1;
                newTarget = target - nums[last];
                while(j > i){
                    int sum = nums[i] + nums[j];
                    if(Math.abs(closet) > Math.abs(newTarget - sum)){
                        closet = newTarget - sum;
                    }
                    if (sum > newTarget){
                        j--;
                    }
                    if (sum < newTarget){
                        i++;
                    }
                    if (sum == newTarget){
                        return target;
                    }
                }
            }
            return target - closet;
        }
    }
}
