import javax.lang.model.util.ElementScanner6;
import javax.swing.plaf.multi.MultiInternalFrameUI;

/*
 * @lc app=leetcode.cn id=704 lang=java
 *
 * [704] 二分查找
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        // if (target < nums[0] || target > nums[nums.length - 1]) {
        //     return -1;
        // }
        // int left = 0;
        // int right = nums.length - 1;

        // while (left <= right) {
        //     int middle = (right - left) / 2 + left;

        //     if (target < nums[middle]) {
        //         right = middle + 1;
        //     } else if (target > nums[middle]) {
        //         left = middle + 1;
        //     } else if (target == nums[middle]) {
        //         return middle;
        //     }
        // }

        // return -1;

    
        // if (target < nums[0] || target > nums[nums.length - 1]) {
        //     return -1;
        // }
        
        // int left = 0;
        // int right = nums.length - 1;
        
        // while (left <= right) {
        //     int middle = ((right - left) >> 1) + left;
            
        //     if (target < nums[middle]) {
        //         right = middle - 1;
        //     } else if (target > nums[middle]) {
        //         left = middle + 1;
        //     } else {
        //         return middle;
        //     }
        // }
        
        // return -1;


        if (target < nums[0] || target > nums[nums.length - 1]) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = left + ((right - left) >> 1);

            if (target == nums[middle]) {
                return middle;
            }

            if (target < nums[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return -1;
    }
}
// @lc code=end

