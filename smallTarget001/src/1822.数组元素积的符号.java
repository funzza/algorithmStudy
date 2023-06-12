/*
 * @lc app=leetcode.cn id=1822 lang=java
 *
 * [1822] 数组元素积的符号
 */

// @lc code=start
class Solution {
    public int arraySign(int[] nums) {

        int minusNum = 0;
        for (int num : nums) {
            if (num < 0) {
                minusNum ++;
            } else if (num == 0) {
                return 0;
            }
        }

        if (minusNum % 2 != 0) {
            return -1;
        }

        return 1;

    }
}
// @lc code=end

