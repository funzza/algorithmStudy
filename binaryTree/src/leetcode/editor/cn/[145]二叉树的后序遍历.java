//给你一棵二叉树的根节点 root ，返回其节点值的 后序遍历 。 
//
// 
//
// 示例 1： 
// 
// 
//输入：root = [1,null,2,3]
//输出：[3,2,1]
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
// 
//
// 提示： 
//
// 
// 树中节点的数目在范围 [0, 100] 内 
// -100 <= Node.val <= 100 
// 
//
// 
//
// 进阶：递归算法很简单，你可以通过迭代算法完成吗？ 
//
// Related Topics 栈 树 深度优先搜索 二叉树 👍 1063 👎 0


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
    public List<Integer> postorderTraversal(TreeNode root) {

        if (root == null) {
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        stack.push(root);

        while (!stack.isEmpty()) {
            root = stack.pop();
            result.add(root.val);

            if (root.left != null) {
                stack.push(root.left);
            }
            if (root.right != null) {
                stack.push(root.right);
            }
        }

        Collections.reverse(result);

        // reverse(result, 0, result.size() - 1);

        return result;

    }

    // void reverse(List<Integer> result, int startIndex, int endIndex) {
    //
    //     while (endIndex > startIndex) {
    //         Integer start = result.get(startIndex);
    //         Integer end = result.get(endIndex);
    //
    //         Integer temp = start;
    //         result.set(startIndex, end);
    //         result.set(endIndex, temp);
    //         startIndex++;
    //         endIndex--;
    //     }
    // }


        // List<Integer> result = new ArrayList<>();
        // process(result, root);
        // return result;
    // }
    // void process(List<Integer> result, TreeNode root) {
    //
    //     if (root == null) {
    //         return;
    //     }
    //
    //     process(result, root.left);
    //     process(result, root.right);
    //     result.add(root.val);
    // }
}
//leetcode submit region end(Prohibit modification and deletion)
