/*
 * @lc app=leetcode.cn id=724 lang=java
 *
 * [724] 寻找数组的中心下标
 */

// @lc code=start
class Solution {
    public int pivotIndex(int[] nums) {
        // int total = 0;
        // int sum = 0;

        // for (int num : nums) {
        //     total += num;
        // }

        // for (int i = 0; i < nums.length; i++) {
        //     if (sum * 2 + nums[i] == total) {
        //         return i;
        //     }
        //     sum += nums[i];
        // }
        
        // return -1;

        int total = 0;

        for (int num : nums) {
            total += num;
        }

        int sumleft = 0;

        for (int i = 0; i < nums.length; i++) {
            sumleft += nums[i];
            if ((total - sumleft) == (sumleft - nums[i])) {
                return i;
            }
        }


        return -1;
    }
}

// @lc code=end

