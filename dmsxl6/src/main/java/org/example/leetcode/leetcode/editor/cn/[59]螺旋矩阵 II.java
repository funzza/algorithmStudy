//给你一个正整数 n ，生成一个包含 1 到 n² 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。 
//
// 
//
// 示例 1： 
// 
// 
//输入：n = 3
//输出：[[1,2,3],[8,9,4],[7,6,5]]
// 
//
// 示例 2： 
//
// 
//输入：n = 1
//输出：[[1]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 20 
// 
//
// Related Topics 数组 矩阵 模拟 👍 1234 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int top = 0;
        int right = n - 1;
        int bottom = n - 1;
        int left = 0;

        int index = 1;
        int m = n * n;

        while (index <= m) {

            for (int col = left; col <= right; col++) {
                if (index > m) {break;}
                result[top][col] = index++;
            }
            top++;

            for (int row = top; row <= bottom; row++) {
                if (index > m) {break;}
                result[row][right] = index++;
            }
            right--;

            for (int col = right; col >= left; col--) {
                if (index > m) {break;}
                result[bottom][col] = index++;
            }
            bottom--;

            for (int row = bottom; row >= top; row--) {
                if (index > m) {break;}
                result[row][left] = index++;
            }
            left++;
        }

        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
