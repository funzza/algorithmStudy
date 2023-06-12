/*
 * @lc app=leetcode.cn id=1502 lang=java
 *
 * [1502] 判断能否形成等差数列
 */

// @lc code=start
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {

        if (arr.length == 0) {
            return true;
        }

        Arrays.sort(arr);

        int temp = arr[0] - arr[1];

        for (int i = 1; i < arr.length - 1; i++) {
            if (temp != arr[i] - arr[i + 1]) {
                return false;
            }
        }

        return true;

    }
}
// @lc code=end

