//package leetcode.dfs;
//
//public class P112 {
//    class Solution {
//        int curSum = 0;
//        public boolean hasPathSum(TreeNode root, int targetSum) {
//            if(root == null)return false;
//            return dfs(root, targetSum);
//        }
//
//        private boolean dfs(TreeNode root, int targetSum){
//            curSum += root.val;
//            if(root.left == null && root.right == null){
//                return curSum == targetSum;
//            }
//            if(root.left != null){
//                if(dfs(root.left, targetSum)) return true;
//                curSum -= root.left.val;
//            }
//            if(root.right != null){
//                if(dfs(root.right, targetSum)) return true;
//                curSum -= root.right.val;
//            }
//            return false;
//        }
//    }
//}
