/*
 * @lc app=leetcode.cn id=509 lang=java
 *
 * [509] 斐波那契数
 */

// @lc code=start
class Solution {
    public int fib(int n) {
		// if (n == 0 || n == 1) {
		// 	return n;
		// }

		// int p = 0;
		// int q = 1;

		// for (int i = 2; i <= n ; i++) {
        //     int temp = q;
		// 	q = p + q;
        //     p = temp;
		// }
		
		// return q;


		// if (n == 0) {
		// 	return 0;
		// }

		// if (n == 1 || n == 2) {
		// 	return 1;
		// }

		// return fib(n - 1) + fib(n - 2);

		// if (n == 0) {
		// 	return 0;
		// }

		// int[] memo = new int[n + 1];
		// return helper(memo, n);

		// if (n <= 1) {
		// 	return n;
		// }

		// int[] dpTable = new int[n + 1];

		// dpTable[1] = 1;
		// dpTable[2] = 1;

		// for (int i = 3; i <= n; i++) {
		// 	dpTable[i] = dpTable[i - 1] + dpTable[i - 2];
		// }

		// return dpTable[n];

	// 	int prev = 0;
	// 	int curr = 1;

	// 	for (int i = 2; i <= n; i++) {
	// 		int temp = prev + curr;
	// 		prev = curr;
	// 		curr = temp;
	// 	}

	// 	return curr;

    // }

	// int helper(int[] memo, int n) {

	// 	if (n == 1 || n == 2) {
	// 		return 1;
	// 	}

	// 	if (memo[n] != 0) {
	// 		return memo[n];
	// 	}
	// 	memo[n] = helper(memo, n - 1) + helper(memo, n - 2);
	// 	return memo[n];
	// }

	// if (n == 0 || n == 1) {
	// 	return n;
	// }

	// int[] result = new int[n + 1];

	// result[0] = 0;
	// result[1] = 1;

	// for(int i = 2; i <= n ; i++) {
	// 	result[i] = result[i - 1] + result[i - 2];
	// }
	
	// return result[n];

	if (n == 0 || n == 1) {
		return n;
	}

	int pre = 0;
	int cur = 1;

	for(int i = 2; i <= n; i++) {
		int temp = pre + cur;
		pre = cur;
		cur = temp;
	}

	return cur;
	}
}
// @lc code=end

