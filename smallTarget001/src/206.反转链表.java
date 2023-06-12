import javax.management.ListenerNotFoundException;

/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
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
    public ListNode reverseList(ListNode head) {

        // if (head == null) {
        //     return null;
        // }
        // if (head.next == null) {
        //     return head;
        // }

        // ListNode last = reverseList(head.next);
        // head.next.next = head;
        // head.next = null;
        // return last;

        // ListNode currentNode = head;
        // ListNode preNode = null;
        // ListNode temp = null;
        // while (currentNode != null) {
        //     temp = currentNode.next;
        //     currentNode.next = preNode;
        //     preNode = currentNode;
        //     currentNode = temp;
        // }

        // return preNode;

        // ListNode preNode = head;
        // ListNode currentNode = preNode.next;
        // ListNode nextNode = currentNode.next;

        // while (nextNode != null) {
        //     currentNode.next = preNode;
        //     preNode = currentNode;
        //     currentNode = nextNode;
        //     nextNode = nextNode.next;
        // }

        // return currentNode;

        // ListNode preNode = null;
        // ListNode curNode = head;
        // ListNode nextNode = head.next;

        // while (nextNode != null) {

        //     ListNode temp = nextNode.next;

        //     curNode.next = preNode;
        //     nextNode.next = curNode;
        //     preNode = curNode;
        //     curNode = nextNode;
        //     nextNode = temp;
        // }


        // return curNode;

        // if (head == null || head.next == null) {
        //     return head;
        // }
        
        // ListNode preNode = head;
        // ListNode curNode = head.next;
        // preNode.next = null;
        
        // while (curNode != null) {
        //     ListNode temp = curNode.next;
            
        //     curNode.next = preNode;
        //     preNode = curNode;
        //     curNode = temp;
        // }
        
        // return preNode;

        if (head == null || head.next == null) {
            return head;
        }

        ListNode currentNode = head.next;
        ListNode preNode = head;
        preNode.next = null;
        
        while (currentNode != null) {
            
            ListNode nextNode = currentNode.next;
            currentNode.next = preNode;
            preNode = currentNode;
            currentNode = nextNode;
        }


        return preNode;


    }
}
// @lc code=end

