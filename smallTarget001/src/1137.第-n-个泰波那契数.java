/*
 * @lc app=leetcode.cn id=1137 lang=java
 *
 * [1137] 第 N 个泰波那契数
 */

// @lc code=start
class Solution {
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        int i = 0;
        int j = 1;
        int k = 1;

        for (int index = 3; index <= n; index++) {
            int temp = k;
            k = i + j + k;
            i = j;
            j = temp;
        }
        
        return k;
    }
}
// @lc code=end

