/*
 * @lc app=leetcode.cn id=80 lang=java
 *
 * [80] 删除有序数组中的重复项 II
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }


        int slowIndex = 2;
        int fastIndex = 2;
        
        while (fastIndex < nums.length) {
            if (nums[slowIndex - 2] != nums[fastIndex]) {
                nums[slowIndex++] = nums[fastIndex];
            }
            fastIndex++;
        }
        
        return slowIndex;

    }
}
// @lc code=end

