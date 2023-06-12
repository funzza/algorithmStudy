/*
 * @lc app=leetcode.cn id=142 lang=java
 *
 * [142] 环形链表 II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        // ListNode fastNode = head;
        // ListNode slowNode = head;

        // while(fastNode != null && fastNode.next != null) {
        //     fastNode = fastNode.next.next;
        //     slowNode = slowNode.next;

        //     if (fastNode == slowNode) {
        //         slowNode = head;
        //         while (fastNode != slowNode) {
        //             fastNode = fastNode.next;
        //             slowNode = slowNode.next;
        //         }
        //         return fastNode;
        //     }

        // }
        // return null;




        // ListNode fastNode = head;
        // ListNode slowNode = head;

        // while (fastNode != null && fastNode.next != null) {
        //     fastNode = fastNode.next.next;
        //     slowNode = slowNode.next;

        //     if (fastNode == slowNode) {
        //         ListNode indexA = head;
        //         ListNode indexB = fastNode;

        //         while (indexA != indexB) {
        //             indexA = indexA.next;
        //             indexB = indexB.next;
        //         }
        //         return indexA;
        //     }
        // }
        // return null;

        ListNode slowNode = head;
        ListNode fastNode = head;

        while (fastNode != null && fastNode.next != null) {
            
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            
            if (fastNode == slowNode) {
                slowNode = head;
                
                while (fastNode != slowNode) {
                    fastNode = fastNode.next;
                    slowNode = slowNode.next;
                }
                
                return slowNode;
            }
        }
        
        return null;
    }
}
// @lc code=end

