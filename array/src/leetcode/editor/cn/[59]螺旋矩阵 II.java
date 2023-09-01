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
// Related Topics 数组 矩阵 模拟 👍 1138 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] generateMatrix(int n) {

        int[][] result = new int[n][n];
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        int index = 1;
        int count = n * n;

        while (index <= n * n) {
            for (int col = left; col <= right; col++) {
                result[top][col] = index++;
            }
            top++;
            if (index > count) {
                break;
            }
            for (int row = top; row <= bottom; row++) {
                result[row][right] = index++;
            }
            right--;
            if (index > count) {
                break;
            }
            for (int col = right; col >= left; col--) {
                result[bottom][col] = index++;
            }
            bottom--;
            if (index > count) {
                break;
            }
            for (int row = bottom; row >= top; row--) {
                result[row][left] = index++;
            }
            left++;
            if (index > count) {
                break;
            }
        }

        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
