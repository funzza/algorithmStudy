/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            String substring = strs[0].substring(i, i+1);
            int j = 1;
            for (; j < strs.length; j++) {
                if (!substring.equals(strs[j].substring(i, i+1))) {
                    break;
                }
            }
            if (j == strs.length) {
                result.append(substring);
            } else {
                break;
            }
        }
        return result.toString();
    }
}
// @lc code=end

