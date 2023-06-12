/*
 * @lc app=leetcode.cn id=1779 lang=java
 *
 * [1779] 找到最近的有相同 X 或 Y 坐标的点
 */

// @lc code=start
class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {

        int sum = Integer.MAX_VALUE;
        int result = -1;

        for (int i = 0; i < points.length; i++) {
            if (points[i][0] == x || points[i][1] == y) {
                int temp = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if (temp < sum) {
                    sum = temp;
                    result = i;
                } 

            }
        }


          return result;

    }
}
// @lc code=end

