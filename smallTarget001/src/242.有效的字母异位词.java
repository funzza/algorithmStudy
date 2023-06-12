import java.util.Map;

/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 */

// @lc code=start
class Solution {
    public  boolean isAnagram(String s, String t) {

        // int[] set = new int[26];

        // for (int i = 0; i < s.length(); i++) {
        //     set[s.charAt(i) - 'a']++;
        // }

        // for (int i = 0; i < t.length(); i++) {
        //     set[t.charAt(i) - 'a']--;
        // }

        // // for (int i = 0; i < set.length; i++) {
        // //     if (set[i] != 0) {
        // //         return false;
        // //     }
        // // }

        // for (int num : set) {
        //     if (num != 0) {
        //         return false;
        //     }
        // }


        // return true;

        int[] set = new int[26];

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        for (char c : sChars) {
            set[c - 'a'] += 1;
        }
        for (char c : tChars) {
            set[c - 'a'] -= 1;
        }

        for (int i : set) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }
}
// @lc code=end

