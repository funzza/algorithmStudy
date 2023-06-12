/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 */

// @lc code=start
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> record = new HashSet<>();

        while (n != 1 && !record.contains(n)) {
            record.add(n);
            n = process(n);
        }

        return n == 1;

    }

    private int process(int num) {
        int temp = 0;
        while (num > 0) {
            temp += (num % 10) * (num % 10);
            num /= 10;
        }
        return temp;
    }
}
// @lc code=end

