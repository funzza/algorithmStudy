import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {

        // List<List<Integer>> result = new ArrayList<>();

        // for (int i = 0; i < numRows; i++) {
        //     List<Integer> answer = new ArrayList<>();
        //     for (int j = 0; j <= i; j++) {
        //         if (j == 0 || j == i) {
        //             answer.add(1);
        //         } else {
        //             answer.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
        //         }
        //     }
        //     result.add(answer);
        // }


        // return result;

        List<List<Integer>> result = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            List<Integer> temp = new ArrayList<>();
            for (int col = 0; col <= row; col++) {
                if (col == 0 || col == row) {
                    temp.add(1);
                } else {
                    temp.add(result.get(row - 1).get(col - 1) + result.get(row - 1).get(col));
                }
            }
            result.add(temp);
        }


        return result;

    }
}
// @lc code=end

