import java.util.List;

/*
 * @lc app=leetcode.cn id=94 lang=java
 *
 * [94] 二叉树的中序遍历
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        process(root, result);
        return  result;
    }

    void process(TreeNode root, List<Integer> result) {

        if (root == null) {
            return;
        }

        process(root.left, result);
        result.add(root.val);
        process(root.right, result);
    }




        // List<Integer> result = new ArrayList<>();
        // process(root, result);

        // return result;
    

    // void process(TreeNode root, List<Integer> result) {
    //     if (root != null) {
    //         process(root.left, result);
    //         result.add(root.val);
    //         process(root.right, result);
    //     }
    // }
}
// @lc code=end

