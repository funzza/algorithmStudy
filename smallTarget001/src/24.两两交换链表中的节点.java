import javax.swing.text.html.HTMLDocument.RunElement;

/*
 * @lc app=leetcode.cn id=24 lang=java
 *
 * [24] 两两交换链表中的节点
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
    public ListNode swapPairs(ListNode head) {


        // ListNode dummyNode = new ListNode();
        // dummyNode.next = head;
        // ListNode current = dummyNode;
        // ListNode temp;
        // while (current.next != null && current.next.next != null) {

        //     temp = current.next.next;
        //     current.next.next = temp.next;
        //     temp.next = current.next;
        //     current.next = temp;

        //     current = current.next.next;
        // }
        // return dummyNode.next;

        ListNode dumyHead = new ListNode(-1);
        dumyHead.next = head;

        ListNode cur = dumyHead;
        ListNode temp;
        ListNode firstNode;
        ListNode secondNode;

        while (cur.next != null && cur.next.next != null) {

            temp = cur.next.next.next;
            firstNode = cur.next;
            secondNode = cur.next.next;

            cur.next = secondNode;
            secondNode.next = firstNode;
            firstNode.next = temp;

            cur = firstNode;
        }
        return dumyHead.next;
    }
}
// @lc code=end

