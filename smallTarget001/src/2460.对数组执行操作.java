/*
 * @lc app=leetcode.cn id=2460 lang=java
 *
 * [2460] 对数组执行操作
 */

// @lc code=start
class Solution {
    public int[] applyOperations(int[] nums) {

        for(int i = 0, j = 0; i < nums.length; i++) {

            if (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }

            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }

        }


        return nums;
        

    }
}
// @lc code=end

