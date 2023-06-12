/*
 * @lc app=leetcode.cn id=566 lang=java
 *
 * [566] 重塑矩阵
 */

// @lc code=start
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        if (r * c != mat.length * mat[0].length) {
            return mat;
        }

        int[][] result = new int[r][c];

        int row = 0;
        int col = 0;

        for (int[] rows : mat) {
            for (int num : rows) {
                result[row][col++] = num;
                if (col == c) {
                    row++;
                    col = 0;
                }
            }
        }


        return result;

    }
}
// @lc code=end

