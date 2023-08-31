//给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。 
//
// 
//
// 示例 1： 
// 
// 
//输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
//输出：[1,2,3,6,9,8,7,4,5]
// 
//
// 示例 2： 
// 
// 
//输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
//输出：[1,2,3,4,8,12,11,10,9,5,6,7]
// 
//
// 
//
// 提示： 
//
// 
// m == matrix.length 
// n == matrix[i].length 
// 1 <= m, n <= 10 
// -100 <= matrix[i][j] <= 100 
// 
//
// Related Topics 数组 矩阵 模拟 👍 1474 👎 0


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int left = 0, bottom = matrix.length - 1, top = 0, right = matrix[0].length - 1;
        int size = (right + 1) * (bottom + 1);

        List<Integer> result = new ArrayList<>();

        while (size > 0) {
            for (int col = left; col <= right ; col++) {
                result.add(matrix[top][col]);
            }
            size -= (right - left + 1);
            if (size <= 0) {
                break;
            }
            top++;
            for (int row = top; row <= bottom; row++) {
                result.add(matrix[row][right]);
            }
            size -= (bottom - top + 1);
            if (size <= 0) {
                break;
            }
            right--;
            for (int col = right; col >= left; col--) {
                result.add(matrix[bottom][col]);
            }
            size -= (right - left + 1);
            if (size <= 0) {
                break;
            }
            bottom--;
            for(int row = bottom; row >= top; row--) {
                result.add(matrix[row][left]);
            }
            size -= (bottom - top + 1);
            if (size <= 0) {
                break;
            }
            left++;
        }

        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
