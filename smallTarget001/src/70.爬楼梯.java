import javax.security.auth.login.CredentialException;

/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
		// int p = 0;
		// int q = 0;
		// int r = 1;
		
		// for (int i = 1; i <= n; i++) {
		// 	p = q;
		// 	q = r;
		// 	r = p + q;
		// }
		
		// return r;

		// if (n <= 1) {
		// 	return n;
		// }

		// int prev = 1;
		// int curr = 2;

		// for (int i = 3; i <= n; i++) {
		// 	int temp = prev + curr;
		// 	prev = curr;
		// 	curr = temp;
		// }

		// return curr;

		// int[] result = new int[n + 1];
        
        // if (n <= 2) {
        //     return n;
        // }
        
        // result[0] = 0;
        // result[1] = 1;
        // result[2] = 2;
        
        // for (int i = 3; i <= n; i++) {
        //     result[i] = result[i - 1] + result[i - 2];
        // }
        

        // return result[n];

		if (n <= 2) {
            return n;
        }
        
        int pre = 1;
        int cur = 2;

        for (int i = 3; i <= n; i++) {
            int temp = pre + cur;
            pre = cur;
            cur = temp;
        }
        
        return cur;
    }
}
// @lc code=end

