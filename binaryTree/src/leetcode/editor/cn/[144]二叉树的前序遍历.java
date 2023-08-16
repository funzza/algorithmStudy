//给你二叉树的根节点 root ，返回它节点值的 前序 遍历。 
//
// 
//
// 示例 1： 
// 
// 
//输入：root = [1,null,2,3]
//输出：[1,2,3]
// 
//
// 示例 2： 
//
// 
//输入：root = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：root = [1]
//输出：[1]
// 
//
// 示例 4： 
// 
// 
//输入：root = [1,2]
//输出：[1,2]
// 
//
// 示例 5： 
// 
// 
//输入：root = [1,null,2]
//输出：[1,2]
// 
//
// 
//
// 提示： 
//
// 
// 树中节点数目在范围 [0, 100] 内 
// -100 <= Node.val <= 100 
// 
//
// 
//
// 进阶：递归算法很简单，你可以通过迭代算法完成吗？ 
//
// Related Topics 栈 树 深度优先搜索 二叉树 👍 1091 👎 0


//leetcode submit region begin(Prohibit modification and deletion)


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
    public List<Integer> preorderTraversal(TreeNode root) {

        // if (root == null) {
        //     return new ArrayList<>();
        // }
        //
        // List<Integer> result = new ArrayList<>();
        // Stack<TreeNode> stack = new Stack<>();
        //
        // stack.push(root);
        //
        // while (!stack.isEmpty()) {
        //     TreeNode curNode = stack.pop();
        //
        //     result.add(curNode.val);
        //     if (curNode.right != null) {
        //         stack.push(curNode.right);
        //     }
        //     if (curNode.left != null) {
        //         stack.push(curNode.left);
        //     }
        // }
        //
        // return result;

        // List<Integer> result = new ArrayList<>();
        // process(result, root);
        // return result;

        if (root == null) {
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode curNode = stack.pop();
            result.add(curNode.val);
            if (curNode.right != null) {
                stack.push(curNode.right);
            }
            if (curNode.left != null) {
                stack.push(curNode.left);
            }
        }

        return result;
    }

    // public void process(List<Integer> result,  TreeNode root) {
    //     if (root == null) {
    //         return;
    //     }
    //
    //     result.add(root.val);
    //     process(result, root.left);
    //     process(result, root.right);
    // }
}
//leetcode submit region end(Prohibit modification and deletion)
