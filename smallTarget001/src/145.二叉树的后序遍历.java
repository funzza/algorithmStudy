import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=145 lang=java
 *
 * [145] 二叉树的后序遍历
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
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        process(root, result);
        return result;
    }

    void process(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        process(root.left, result);
        process(root.right, result);
        result.add(root.val);
    }

    // List<Integer> result = new ArrayList<>();
    // process(root, result);
    // return result;

    // void process(TreeNode root, List<Integer> result) {

    //     if (root != null) {
    //         process(root.left, result);
    //         process(root.right, result);
    //         result.add(root.val);
    //     }
    // }

}
// @lc code=end

