/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子数组和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {

        // int leftIndex = 0;
        // int rightIndex = 0;

        // int ans = nums[0], previous = nums[0];

        // for (int i = 1; i < nums.length; i++) {
        //     previous = Math.max(previous + nums[i], nums[i]);
        //     ans = Math.max(previous, ans);
        // }
        // return ans;


        // int result = nums[0];
        // int previous = nums[0];

        // for (int i = 1; i < nums.length; i++) {
        //     previous = Math.max(previous + nums[i], nums[i]);
        //     result = Math.max(previous, result);
        // }

        // return result;

        int previous = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            previous = Math.max(previous + nums[i], nums[i]);
            result = Math.max(previous, result);
        }
        
        return  result;

    }
}
// @lc code=end

