/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {

        // if (target < nums[0]) {
        //     return 0;
        // }

        // if (target > nums[nums.length - 1]) {
        //     return nums.length;
        // }

        // int left = 0;
        // int right = nums.length - 1;

        // while (left < right) {
        //     int middle = ((right - left) >> 1) + left;
        //     if (target == nums[middle]) {
        //         return middle;
        //     }

        //     if (target > nums[middle]) {
        //         left = middle + 1;
        //     } else if (target < nums[middle]) {
        //         right = middle;
        //     }
        // }

        // return left;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = left + ((right - left) >> 1);

            if (target > nums[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }


        return left;
    }
}
// @lc code=end

