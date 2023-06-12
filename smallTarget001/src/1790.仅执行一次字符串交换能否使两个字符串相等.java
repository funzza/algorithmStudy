import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=1790 lang=java
 *
 * [1790] 仅执行一次字符串交换能否使两个字符串相等
 */

// @lc code=start
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        Map<Character, Integer> s1Map = new HashMap<>();
        Map<Character, Integer> s2Map = new HashMap<>();

        for (char c : s1.toCharArray()) {
            s1Map.put(c, s1Map.getOrDefault(c, 0) + 1);
        }
        for (char c : s2.toCharArray()) {
            s2Map.put(c, s2Map.getOrDefault(c, 0) + 1);
        }
        
        int count = 0;

        for (int i = 0; i < s1.length(); i++) {

            if (s1Map.get(s1.charAt(i)) != (s2Map.get(s1.charAt(i)))) {
                return false;
            }
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (count > 2) {
                    return false;
                }
            }
        }

        return (count == 2 || count == 0);

    }
}
// @lc code=end

