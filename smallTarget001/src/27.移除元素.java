/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {

        // int fastIndex = 0;
        // int slowIndex = 0;

        // for (;fastIndex < nums.length; fastIndex++) {
        //     if (nums[fastIndex] != val) {
        //         nums[slowIndex] = nums[fastIndex];
        //         slowIndex++;
        //     }
        // }

        // return slowIndex;


        // int fastIndex =0;
        // int slowIndex = 0;

        // for (;fastIndex < nums.length;fastIndex++) {
        //     if (nums[fastIndex] != val) {
        //         nums[slowIndex++] = nums[fastIndex];
        //     }
        // }

        // return slowIndex;

        int index = 0;
        for (int num : nums) {
            if (num != val) {
                nums[index++] = num;
            }
        }
        
        
        return index;

    }
}
// @lc code=end

