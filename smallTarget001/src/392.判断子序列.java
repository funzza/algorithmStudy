/*
 * @lc app=leetcode.cn id=392 lang=java
 *
 * [392] 判断子序列
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {

        if (s == null || s.length() == 0) {
            return true;
        }

        int index = 0;
        int length = s.length();
        
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(index) == t.charAt(i)) {
                index++;
            }
            if (index == length) {
                return true;
            }
        }
        
        
        return false;
    }
}
// @lc code=end

