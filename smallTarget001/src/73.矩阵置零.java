import javax.swing.plaf.basic.BasicBorders.MarginBorder;

/*
 * @lc app=leetcode.cn id=73 lang=java
 *
 * [73] 矩阵置零
 */

// @lc code=start
class Solution {
    public void setZeroes(int[][] matrix) {
        // for(int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[0].length; j++) {

        //         if (matrix[i][j] == 0) {
        //             for (int k = 0; k < matrix.length; k++) {
        //                 matrix[k][j] = matrix[k][j] == 0 ? 0 : 99999;
        //             }
        //             for (int k = 0; k < matrix[0].length; k++) {
        //                 matrix[i][k] = matrix[i][k] == 0 ? 0 : 99999;
        //             }
        //         }
        //     }
        // }

        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         if (matrix[i][j] == 99999) {
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }


        // int row = matrix.length;
        // int col = matrix[0].length;

        // boolean row0Flag = false;
        // boolean col0Flag = false;

        // for (int i = 0; i < col; i++) {
        //     if (matrix[0][i] == 0) {
        //         row0Flag = true;
        //     }
        // }
        // for (int i = 0; i < row; i++) {
        //     if (matrix[i][0] == 0) {
        //         col0Flag = true;
        //     }
        // }

        // for (int i = 1; i < row; i++) {
        //     for (int j = 1; j < col; j++) {
        //         if (matrix[i][j] == 0) {
        //             matrix[0][j] = 0;
        //             matrix[i][0] = 0;
        //         }
        //     }
        // }

        // for (int i = 1; i < row; i++) {
        //     for (int j = 1; j < col; j++) {
        //         if (matrix[0][j] == 0 || matrix[i][0] == 0) {
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }

        // if (row0Flag) {
        //     for (int i = 0; i < col; i++) {
        //         matrix[0][i] = 0;
        //     }
        // }
        // if (col0Flag) {
        //     for (int i = 0; i < row; i++) {
        //         matrix[i][0] = 0;
        //     }
        // }

		int row = matrix.length;
		int col = matrix[0].length;

		boolean firstRowIsZero = false;
		boolean firstColIsZero = false;

		for (int i = 0; i < col; i++) {
			if (matrix[0][i] == 0){
				firstRowIsZero = true;
				break;
			}
		}

		for (int i = 0; i < row; i++) {
			if (matrix[i][0] == 0) {
				firstColIsZero = true;
				break;
			}
		}

		for (int i = 1; i < row; i++) {
			for (int j = 1; j < col; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}

		for (int i = 1; i < row; i++) {
			for (int j = 1; j < col; j++) {
				if (matrix[i][0] == 0 || matrix[0][j] == 0) {
					matrix[i][j] = 0;
				}
			}
		}

		if (firstRowIsZero) {
			for (int i = 0; i < col; i++) {
				matrix[0][i] = 0;
			}
		}

		if (firstColIsZero) {
			for (int i = 0; i < row; i++) {
				matrix[i][0] = 0;
			}
		}


    }

}
// @lc code=end

