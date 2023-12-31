import java.util.Arrays;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=217 lang=java
 *
 * [217] 存在重复元素
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // for (int i = 0; i < nums.length - 1; i++) {
        //     if (nums[i] == nums[i + 1]) {
        //         return true;
        //     }
        // }
        // return false;

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;


        // Arrays.sort(nums);

        // for (int i = 1; i < nums.length; i++) {
        //     if (nums[i] == nums[i - 1]) {
        //         return true;
        //     }
        // }

        // return false;
    }
}
// @lc code=end

