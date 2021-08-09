package leetcode.dfs;


import java.util.ArrayList;
import java.util.List;

class TreeNode {

}

/**
 * 判断是否是二叉搜索树
 * 两种做法：
 * 1。 递归判断子树，是否在某个给定的范围内。
 * 2。 中序遍历，是否升序。
 */
public class P98 {
    class Solution {
        public boolean isValidBST(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            traverse(root, list);
            for(int i = 0; i < list.size() - 1; i++){
                if(list.get(i) >= list.get(i + 1)){
                    return false;
                }
            }
            return true;
        }

        private void traverse(TreeNode root, List<Integer> list){
            if(root == null){
                return;
            }
            traverse(root.left, list);
            list.add(root.val);
            traverse(root.right, list);
        }
    }
}
