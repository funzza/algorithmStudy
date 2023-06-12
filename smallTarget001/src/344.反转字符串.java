/*
 * @lc app=leetcode.cn id=344 lang=java
 *
 * [344] 反转字符串
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {

        // int l = 0;
        // int r = s.length - 1;

        // while (l < r) {
        //     s[l] ^= s[r];
        //     s[r] ^= s[l];
        //     s[l] ^= s[r];
        //     l++;
        //     r--; 
        // }



        int l = 0; 
        int r = s.length - 1;

        while (l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }

    }
}
// @lc code=end

