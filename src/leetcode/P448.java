package leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class P448 {
    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            HashSet<Integer> hset = new HashSet<>();
            for (int i: nums){
                hset.add(i);
            }
            List<Integer> res = new ArrayList<>();
            for (int i=1; i<nums.length + 1;i++){
                if(!hset.contains(i)){
                    res.add(i);
                }
            }
            return res;
        }
    }
}
