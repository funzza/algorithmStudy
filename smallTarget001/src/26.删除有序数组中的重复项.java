/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除有序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        
    //     int slowIndex = 0;
    //     for (int fastIndex = 1; fastIndex < nums.length; fastIndex++) {
    //         if (nums[fastIndex] != nums[slowIndex]) {
    //             slowIndex++;
    //             nums[slowIndex] = nums[fastIndex];
    //         }
    //     }

    //     return slowIndex + 1;

    // }

    // int fastIndex = 0;
    // int slowIndex = 0;

    // for (; fastIndex < nums.length; fastIndex++) {
    //     if (nums[fastIndex] == nums[slowIndex]) {
    //         continue;
    //     }
    //     nums[++slowIndex] = nums[fastIndex];
    // }

    // return slowIndex + 1;

    int k = 0;
        
    for (int num : nums) {
        if(nums[k] != num) {
            nums[++k] = num;
        }
    }

    return k + 1;

}
}
// @lc code=end

