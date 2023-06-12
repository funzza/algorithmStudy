/*
 * @lc app=leetcode.cn id=83 lang=java
 *
 * [83] 删除排序链表中的重复元素
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = new ListNode();
        newHead.next = head;
        ListNode preNode = head;
        ListNode curNode = head.next;
        
        while (curNode != null) {
            int preVal = preNode.val;
            if (preVal == curNode.val) {
                preNode.next = curNode.next;
            } else {
                preNode = curNode;
            }
            curNode = curNode.next;
        }
        
        return newHead.next;
    }
}
// @lc code=end

