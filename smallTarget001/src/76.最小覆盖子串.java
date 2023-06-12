import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.swing.plaf.SliderUI;

/*
 * @lc app=leetcode.cn id=76 lang=java
 *
 * [76] 最小覆盖子串
 */

// @lc code=start
class Solution {

    public String minWindow(String s, String t) {
        
        // if (s == null ||
        // t == null ||
        // s.isEmpty() ||
        // t.isEmpty() ||
        // s.length() < t.length()) {
        //     return "";
        // }

        // Map<Character, Integer> tMap = new HashMap<>();

        // char[] tChars = t.toCharArray();
        // for (char tChar : tChars) {
        //     tMap.put(tChar, tMap.getOrDefault(tChar, 0) + 1);
        // }
        // Map<Character, Integer> temp = new HashMap<>();
        // temp.putAll(tMap);

        // Map<Character, Integer> sTemp = new HashMap<>();

        // char[] sChars = s.toCharArray();

        // int start = 0;

        // int leftIndex = 0;
        // int rightIndex = 0;
        // int size = Integer.MAX_VALUE;

        // for (int end = start; end < sChars.length; end++) {
        //     if (temp.containsKey(sChars[end])) {
        //         temp.put(sChars[end], temp.get(sChars[end]) - 1);
        //         if (temp.get(sChars[end]) == 0) {
        //             temp.remove(sChars[end]);
        //         }
        //     }

        //     if (temp.size() == 0) {
        //         if ((end - start + 1) < size) {
        //             size = end - start + 1;
        //             leftIndex = start;
        //             rightIndex = end + 1;
        //         }

        //         // 滑动该窗口
        //         int index = start;


        //         do {
        //             index++;
        //         } while(index <= end && !tMap.containsKey(sChars[index]));

        //         start = index;

        //         end = start - 1;
        //         temp.putAll(tMap);
        //     }
        // }


        // String substring = s.substring(leftIndex, rightIndex);


        // return substring;
        
        int[] need = new int[128];
        // 用这种方式可以替代Map,字符串中字符ASCII码对应数组下标，下标上的值表示该字符出现次数
        // need数组记录需要的字符及字符个数

        for (int i = 0; i < t.length(); i++) {
            need[t.charAt(i)]++;
        }


        int left = 0;
        int right = 0;
        int size = Integer.MAX_VALUE;
        int count = t.length();
        int start = 0;
        // left right 窗口左右边界 size 窗口长度 count 需要找到的字符个数 start 子串开始位置

        while (right < s.length()) {
            // 窗口右边界小于字符串长度  窗口开始向右扩展
            char c = s.charAt(right);
            // 右边界的字符
            if (need[c]-- > 0) {
                count--;
            }
            // need[c]大于0 表示t字符串中有该字符，说明找到了一个字符 这个字符待找的个数减1 总待找的字符个数减1
            // 即使字符c并不在t字符串中，也减一 这样我们可以记录多余的字符（负数）

            if (count == 0) {
            // count为0表示当前窗口已经涵盖了t字符串中所有字符 开始缩减窗口左边界
                while (left < right && need[s.charAt(left)] < 0) {
                    // 窗口左边界没有超过右边界
                    // 左边界的字符是多余的 向右缩一位
                    need[s.charAt(left)]++;
                    left++;
                    // 多余的个数减1
                }

                if (right - left + 1 < size) {
                    size = right - left + 1;
                    start = left;
                }
                // 维护 窗口大小 子串开始位置

                need[s.charAt(left++)]++;
                count++;
                
                // 窗口再往右缩一位 子串大小需要扩大 进入下一轮循环
            }

            right++;
        }


        return size == Integer.MAX_VALUE ? "" : s.substring(start, start + size);

    }



}
// @lc code=end

