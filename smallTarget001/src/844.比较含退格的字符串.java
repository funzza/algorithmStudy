/*
 * @lc app=leetcode.cn id=844 lang=java
 *
 * [844] 比较含退格的字符串
 */

// @lc code=start
class Solution {
    public boolean backspaceCompare(String s, String t) {

        s = backSpace(s);
        t = backSpace(t);

        if (s == null && t == null) {
            return true;
        }

        if (s != null) {
            if (t == null) {
                return false;
            }
        } else {
            if (t != null) {
                return false;
            }
        }

        return s.equals(t);
        
    }

    public String backSpace(String string) {

        char[] chars = string.toCharArray();

        int slowIndex = -1;
        for(int fastIndex = 0; fastIndex < chars.length; fastIndex++) {

            if (chars[fastIndex] != '#') {
                slowIndex++;
                chars[slowIndex] = chars[fastIndex];
            } else {
                if (slowIndex >= 0) {
                    slowIndex--;
                }
            }
        }
        

        if (slowIndex  < 0) {
            return null;
        } 

        return String.valueOf(chars).substring(0, slowIndex + 1);
    }
}
// @lc code=end

