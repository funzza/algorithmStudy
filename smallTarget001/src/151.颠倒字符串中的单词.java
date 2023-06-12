/*
 * @lc app=leetcode.cn id=151 lang=java
 *
 * [151] 颠倒字符串中的单词
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        StringBuilder sb = removeSpace(s);

        reverseString(sb, 0, sb.length() - 1);

        reverseEachWord(sb);


        return sb.toString();
    }

    private StringBuilder removeSpace(String s) {

        int start = 0;
        int end = s.length() - 1;

        while (start != ' ') {
            start ++;
        }
        while (end != ' ') {
            end --;
        }

        StringBuilder result = new StringBuilder();

        for (int i = start; i <= end; i++) {
            if (s.charAt(i) != ' ' || result.charAt(result.length() - 1) != ' ') {
                result.append(s.charAt(i));
            }
        }
        return result;
    }

    public void reverseString(StringBuilder sb, int start, int end) {

        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }


    private void reverseEachWord(StringBuilder sb) {
        int start = 0;
        int end = 1;
        int length = sb.length();
        
        while (start < length) {
            while (sb.charAt(end) != ' ') {
                end++;
            }
            reverseString(sb, start, end - 1);
            start = end + 1;
            end = start + 1;
        }
    }
}
// @lc code=end

