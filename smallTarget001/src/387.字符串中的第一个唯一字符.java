/*
 * @lc app=leetcode.cn id=387 lang=java
 *
 * [387] 字符串中的第一个唯一字符
 */

// @lc code=start
class Solution {
    public int firstUniqChar(String s) {

        // int[] temp = new int[26];

        // char[] chars = s.toCharArray();
        // for (char aChar : chars) {
        //     temp[aChar - 'a'] += 1;
        // }

        // for (int i = 0; i < chars.length; i++) {
        //     if (temp[chars[i] - 'a'] == 1) {
        //         return i;
        //     }
        // }


        // return -1;
        int[] chars = new int[26];

		for(int i = 0; i < s.length(); i++) {
			chars[s.charAt(i) - 'a']++;
		}

		for (int i = 0; i < s.length(); i++) {
			if (chars[s.charAt(i) - 'a'] == 1) {
				return i;
			}
		}

		return -1;
    }
}
// @lc code=end

