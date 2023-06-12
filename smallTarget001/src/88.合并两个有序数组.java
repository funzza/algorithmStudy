/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int[] temp = new int[m];
        // for(int i = 0; i < m; i++) {
        //     temp[i] = nums1[i];
        // }

        // int index = 0;
        // int mIndex = 0;
        // int nIndex = 0;

        // while (mIndex < m && nIndex < n) {
        //     nums1[index++] = temp[mIndex] < nums2[nIndex] ? temp[mIndex++] : nums2[nIndex++];
        // }
        // if (mIndex == m) {
        //     while (index < m + n) {
        //         nums1[index++] = nums2[nIndex++];
        //     }
        // } else {
        //     while (index < m + n) {
        //         nums1[index++] = temp[mIndex++];
        //     }
        // }

        // int index = m + n - 1;
        // n--;
        // m--;
        
        // while (n >= 0) {
        //     nums1[index--] = m >= 0 && nums1[m] >= nums2[n] ? nums1[m--] : nums2[n--];
        // }

        // int index = m + n - 1;
        // m--;
        // n--;

        // while (n >= 0) {
        //     nums1[index--] = m >= 0 && nums1[m] >= nums2[n] ? nums1[m--] : nums2[n--];
        // }

        int index = m + n - 1;
        m--;
        n--;

        while (m >= 0 && n >= 0) {
            if (nums1[m] >= nums2[n]) {
                nums1[index--] = nums1[m--];
            } else {
                nums1[index--] = nums2[n--];
            }
        }
        while (n >= 0) {
            nums1[index--] = nums2[n--];
        }

    }
}
// @lc code=end

