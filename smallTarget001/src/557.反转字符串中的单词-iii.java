/*
 * @lc app=leetcode.cn id=557 lang=java
 *
 * [557] 反转字符串中的单词 III
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {

        char[] chars = s.toCharArray();
        
        for (int left = 0, right = 0; right < chars.length; right++) {

            if (chars[right] == ' ') {
                reverse(chars, left, right - 1);
                left = right + 1;
            }

            if (right == chars.length - 1) {
                reverse(chars, left, right);
            }

        }

        return String.valueOf(chars);
    }

    void reverse(char[] chars, int left, int right) {
        while (left < right) {
            
            char t = chars[left];
            chars[left] = chars[right];
            chars[right] = t;

            left++;
            right--;
        }
    }


    
}
// @lc code=end

