/*
 * @lc app=leetcode.cn id=36 lang=java
 *
 * [36] 有效的数独
 */

// @lc code=start
class Solution {
    public boolean isValidSudoku(char[][] board) {

        // // 行循环
        // for (char[] chars : board) {
        //     Set<Character> set = new HashSet<>();
        //     for (char aChar : chars) {
        //         if (aChar >= '0' && aChar <= '9') {
        //             if (set.contains(aChar)) {
        //                 return false;
        //             } else {
        //                 set.add(aChar);
        //             }
        //         }
        //     }
        // }

        // // 列循环
        // for (int i = 0; i < 9; i++) {
        //     Set<Character> set = new HashSet<>();
        //     for (int j = 0; j < 9; j++) {
        //         if (board[j][i] >= '0' && board[j][i] <= '9') {
        //             if (set.contains(board[j][i])) {
        //                 return false;
        //             } else {
        //                 set.add(board[j][i]);
        //             }
        //         }
        //     }
        // }

        // for (int col = 0; col <= 6; col += 3 ) {
        //     for (int cow = 0; cow <= 6; cow += 3) {
        //         Set<Character> set = new HashSet<>();
        //         for (int i = col; i < col + 3; i++) {
        //             for (int j = cow; j < cow + 3; j++) {
        //                 if (board[i][j] >= '0' && board[i][j] <= '9') {
        //                     if (set.contains(board[i][j])) {
        //                         return false;
        //                     } else {
        //                         set.add(board[i][j]);
        //                     }
        //                 }
        //             }
        //         }
        //     }
        // }



        // return true;

        int[][] row = new int[9][10];
		int[][] col = new int[9][10];
		int[][] box = new int[9][10];

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {

				if (board[i][j] == '.') {
					continue;
				}

				int curNum = board[i][j] - '0';
				if (row[i][curNum] == 1) {
					return false;
				}
				if (col[j][curNum] == 1) {
					return false;
				}
				if (box[j / 3 + (i / 3) * 3][curNum] == 1) {
					return  false;
				}

				row[i][curNum] = 1;
				col[j][curNum] = 1;
				box[j / 3 + (i / 3) * 3][curNum] = 1;
			}
		}
		
		return true;
    }
}
// @lc code=end

