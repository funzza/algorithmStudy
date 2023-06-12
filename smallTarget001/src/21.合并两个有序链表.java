/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // if (list1 == null) {
        //     return list2;
        // } else if (list2 == null) {
        //     return list1;
        // }

        // ListNode curNode1 = list1;
        // ListNode curNode2 = list2;
        // ListNode preNode = new ListNode();
        // ListNode newHead = new ListNode();
        // newHead.next = list1.val <= list2.val ? list1 : list2;

        // while (curNode1 != null && curNode2 != null) {
        //     if (curNode1.val <= curNode2.val) {
        //         preNode.next = curNode1;
        //         curNode1 = curNode1.next;
        //         preNode = preNode.next;
        //     } else {
        //         preNode.next = curNode2;
        //         curNode2 = curNode2.next;
        //         preNode = preNode.next;
        //     }
        // }

        // if (curNode1 != null) {
        //     preNode.next = curNode1;
        // } 
        // if (curNode2 != null) {
        //     preNode.next = curNode2;
        // }
        
        // return newHead.next;

        ListNode newHead = new ListNode();
        ListNode curNode = newHead;
        
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curNode.next = list1;
                list1 = list1.next;
            } else {
                curNode.next = list2;
                list2 = list2.next;
            }

            curNode = curNode.next;
        }

        if (list1 != null) {
            curNode.next = list1;
        }

        if (list2 != null) {
            curNode.next = list2;
        }

        return newHead.next;

    }
}
// @lc code=end

