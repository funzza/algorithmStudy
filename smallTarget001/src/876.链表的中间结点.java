/*
 * @lc app=leetcode.cn id=876 lang=java
 *
 * [876] 链表的中间结点
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
    public ListNode middleNode(ListNode head) {
        // ListNode slowNode = head;
        // ListNode fastNode = head;

        // while (fastNode != null && fastNode.next != null) {
        //     slowNode = slowNode.next;
        //     fastNode = fastNode.next.next;
        // }

        // return slowNode;

        ListNode slowNode = head;
        ListNode fastNode = head;
        
        while (fastNode != null && fastNode.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        
        return slowNode;
    }
}
// @lc code=end

