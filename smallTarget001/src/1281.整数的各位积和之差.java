/*
 * @lc app=leetcode.cn id=1281 lang=java
 *
 * [1281] 整数的各位积和之差
 */

// @lc code=start
class Solution {
    public int subtractProductAndSum(int n) {

        int product = 1;
        int sum = 0;
        
        while (n > 0) {
            // int temp = n - (n / 10 * 10);
            product *= n - (n / 10 * 10);
            sum += n - (n / 10 * 10);
            n /= 10;
        }

        return product - sum;


    }
}
// @lc code=end

