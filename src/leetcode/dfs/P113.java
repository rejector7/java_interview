package leetcode.dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * 回溯
 */
public class P113 {
    class Solution {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> itemRes = new ArrayList<>();
        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            dfs(root, targetSum);
            return res;
        }
        private void dfs(TreeNode root, int targetSum){
            if(root == null) return;
            if(root.left == null && root.right == null){
                if(root.val == targetSum){
                    itemRes.add(root.val);
                    res.add(new ArrayList<>(itemRes));
                    itemRes.remove(itemRes.size() - 1);
                    return;
                }
                return;
            }
            itemRes.add(root.val);
            dfs(root.left, targetSum - root.val);
            dfs(root.right, targetSum - root.val);
            itemRes.remove(itemRes.size() - 1);
        }
    }
}
