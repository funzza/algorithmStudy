/*
 * @lc app=leetcode.cn id=746 lang=java
 *
 * [746] 使用最小花费爬楼梯
 */

// @lc code=start
class Solution {
    public int minCostClimbingStairs(int[] cost) {

        // int[] dp = new int[cost.length];

        // dp[0] = cost[0];
        // dp[1] = cost[1];

        // for (int i = 2; i < cost.length;i++) {
        //     dp[i] = Math.min(dp[i - 1], dp[i -2]) + cost[i];
        // }

        // return Math.min(dp[cost.length - 1], dp[cost.length - 2]);


        // int prev = cost[0];
        // int curr = cost[1];

        // for (int i = 2; i < cost.length; i++) {
        //     int temp = Math.min(prev, curr) + cost[i];
        //     prev = curr;
        //     curr = temp;
        // }

        // return Math.min(prev, curr);

        // int[] result = new int[cost.length + 1];

        // result[0] = cost[0];
        // result[1] = cost[1];

        // for (int i = 2; i < cost.length; i++) {
        //     result[i] = Math.min(result[i - 1], result[i - 2]) + cost[i];
        // }

        // return Math.min(result[cost.length - 1], result[cost.length - 2]);
    
        int pre = cost[0];
        int cur = cost[1];

        for (int i = 2; i < cost.length; i++) {
            int temp = Math.min(pre, cur) + cost[i];
            pre = cur;
            cur = temp;
        }

        return Math.min(pre, cur);
    }
}
// @lc code=end

