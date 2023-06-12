import java.util.Map;

import javax.swing.plaf.basic.BasicBorders.MarginBorder;

/*
 * @lc app=leetcode.cn id=383 lang=java
 *
 * [383] 赎金信
 */

// @lc code=start
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        // int[] set = new int[26];

        // for (char c : magazine.toCharArray()) {
        //     set[c - 'a'] += 1;
        // }
        // for (char c : ransomNote.toCharArray()) {
        //     set[c - 'a'] -= 1;
        // }
        // for (int num : set) {
        //     if (num < 0) {
        //         return false;
        //     }
        // }
        // return true;


        // int[] set = new int[26];

        // char[] chars = ransomNote.toCharArray();
        // for (char aChar : chars) {
        //     set[aChar - 'a']+= 1;
        // }

        // char[] chars1 = magazine.toCharArray();
        // for (char c : chars1) {
        //     set[c - 'a'] -= 1;
        // }

        // for (int i : set) {
        //     if (i >= 1) {
        //         return false;
        //     }
        // }


        // return true;

		int[] temp = new int[26];

		for (int i = 0; i < ransomNote.length(); i++) {
			temp[ransomNote.charAt(i) - 'a']++;
		}
		for (int i = 0; i < magazine.length(); i++) {
			temp[magazine.charAt(i) - 'a']--;
		}

		for (int i : temp) {
			if (i > 0) {
				return false;
			}
		}

		return true;

        

    }
}
// @lc code=end

