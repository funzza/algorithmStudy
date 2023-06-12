/*
 * @lc app=leetcode.cn id=1491 lang=java
 *
 * [1491] 去掉最低工资和最高工资后的工资平均值
 */

// @lc code=start
class Solution {
    public double average(int[] salary) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        
        for (int i : salary) {
            sum += i;
            max = max >= i ? max : i;
            min = min <= i ? min : i;
        }
        
        return (double)(sum - max - min) / (salary.length - 2);

    }
}
// @lc code=end

