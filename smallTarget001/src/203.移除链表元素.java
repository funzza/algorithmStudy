/*
 * @lc app=leetcode.cn id=203 lang=java
 *
 * [203] 移除链表元素
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
    public ListNode removeElements(ListNode head, int val) {

        // if (head == null) {
        //     return null;
        // }
        // ListNode dummyNode  = new ListNode(-1, head);
        // ListNode currentNode = head;
        // ListNode preNode = dummyNode;
    
        // while(currentNode != null) {

        //     if (currentNode.val == val) {
        //         preNode.next = currentNode.next;
        //     } else {
        //         preNode = currentNode;
        //     }

        //     currentNode = currentNode.next;
        // }

        // return dummyNode.next;

        // ListNode dummyHead = new ListNode();
        // dummyHead.next = head;

        // ListNode preNode = dummyHead;
        // ListNode currentNode = preNode.next;

        // while (currentNode != null) {
        //     if (currentNode.val == val) {
        //         preNode.next = currentNode.next;
        //     } else {
        //         preNode = currentNode;
        //     }
        //     currentNode = preNode.next;
        // }

        // return dummyHead.next;

        if (head == null) {
            return head;
        }
        ListNode newHead = new ListNode();
        newHead.next = head;

        ListNode preNode = newHead;
        ListNode curNode = head;

        while (curNode != null) {
            if (curNode.val == val) {
                preNode.next = curNode.next;
            } else {
                preNode = preNode.next;
            }
            curNode = curNode.next;
        }

        return newHead.next;




    }



        // if (head == null) {
        //     return null;
        // }

        // ListNode simulateHead = new ListNode();
        // simulateHead.next = head;

        // ListNode preNode = simulateHead;
        // ListNode currentNode = head;

        // while (currentNode != null) {

        //     if (currentNode.val == val) {   
        //         preNode.next = currentNode.next;
        //     } else {
        //         preNode = currentNode;
        //     }
        //     currentNode = currentNode.next;

        // }
        // return simulateHead.next;
}
// @lc code=end

