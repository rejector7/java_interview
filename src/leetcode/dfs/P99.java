//package leetcode.dfs;
//
//
///**
// *
// *  1 5(first) 3 4 2(last) 6
// */
//public class P99 {
//    class Solution {
//        TreeNode first = null;
//        TreeNode last = null;
//        TreeNode prev=new TreeNode(Integer.MIN_VALUE);
//        public void recoverTree(TreeNode root) {
//            dfs(root);
//            int temp;
//            temp = first.val;
//            first.val = last.val;
//            last.val = temp;
//        }
//
//        private void dfs(TreeNode root){
//            if(root == null){
//                return;
//            }
//            dfs(root.left);
//            if(root.val < prev.val){
//                last = root;
//                if(first == null){
//                    first = prev;
//                }
//            }
//            prev = root;
//            dfs(root.right);
//        }
//    }
//}
