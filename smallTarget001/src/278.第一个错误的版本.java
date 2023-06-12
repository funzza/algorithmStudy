import javax.sound.midi.MidiChannel;

/*
 * @lc app=leetcode.cn id=278 lang=java
 *
 * [278] 第一个错误的版本
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if (n == 1) {
            return n;
        }

        int first = 1;
        int last = n;

        while (first < last) {
            int middle = ((last - first) >> 1) + first;
            // if (isBadVersion(middle) && !isBadVersion(middle - 1)) {
            //     return middle;
            // }
            if (isBadVersion(middle)) {
                last = middle;
            } else {
                first = middle + 1;
            }
        }
        return first;
    }
}
// @lc code=end

