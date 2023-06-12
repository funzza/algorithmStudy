/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        
        // int slowIndex = 0;
        // for(int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
        //     if (nums[fastIndex] != 0) {
        //         nums[slowIndex] = nums[fastIndex];
        //         slowIndex++;
        //     }
        // }

        // for (; slowIndex < nums.length; slowIndex++) {
        //     nums[slowIndex] = 0;
        // }

        // int fastIndex = 0;
        // int slowIndex = 0;

        // for (;fastIndex < nums.length; fastIndex++) {
        //     if (nums[fastIndex] != 0) {
        //         swap(nums, fastIndex, slowIndex);
        //         slowIndex++;
        //     }
        // }

        int slowIndex = 0;

        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != 0) {
                swap(nums, fastIndex, slowIndex++);
            }
        }

    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
// @lc code=end

