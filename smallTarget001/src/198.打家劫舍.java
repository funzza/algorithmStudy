/*
 * @lc app=leetcode.cn id=198 lang=java
 *
 * [198] 打家劫舍
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        
        int length = nums.length;
        
        for (int i = 0; i < length; i+= 2) {
            count1 += nums[i];
        }
        for (int i = 1; i < length; i += 2) {
            count2 += nums[i];
        }
        return Math.max(count1, count2);
    }
}
// @lc code=end

