/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第 N 个结点
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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // ListNode dummyHead = new ListNode();
        // dummyHead.next = head;
        // ListNode tailNode = dummyHead;
        // ListNode currentNode = dummyHead;

        // for (int i = 0; i < n; i++) {
        //     tailNode = tailNode.next;
        // }

        // while (tailNode.next != null) {
        //     currentNode = currentNode.next;
        //     tailNode = tailNode.next;
        // }

        // currentNode.next = currentNode.next.next;

        // return dummyHead.next;

        ListNode dummyHead = new ListNode();
        dummyHead.next = head;

        ListNode firstNode = dummyHead;
        ListNode secondNode = dummyHead;

        for (int i = 0; i < n; i++) {
            firstNode = firstNode.next;
        }

        while (firstNode.next != null) {
            firstNode = firstNode.next;
            secondNode = secondNode.next;
        }

        secondNode.next = secondNode.next.next;

        return dummyHead.next;
    }
}
// @lc code=end

