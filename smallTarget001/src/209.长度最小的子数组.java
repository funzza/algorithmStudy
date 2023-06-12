/*
 * @lc app=leetcode.cn id=209 lang=java
 *
 * [209] 长度最小的子数组
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        // int size = Integer.MAX_VALUE;
        

        // for (int startIndex = 0; startIndex < nums.length; startIndex ++) {
        //     int sum = 0;
        //     int tempSize = 0;
        //     for (int endIndex = startIndex; endIndex < nums.length; endIndex ++) {
        //         sum += nums[endIndex];
        //         tempSize ++;
        //         if (sum >= target) {
        //             size = tempSize < size ? tempSize : size;
        //             break;
        //         }
        //     }
        // }
        // return size < Integer.MAX_VALUE ? size : 0;

        // int result = Integer.MAX_VALUE;
        // int length = 0;
        // int sum = 0;
        // int leftIndex = 0;
        // for(int rightIndex = 0; rightIndex < nums.length; rightIndex ++) {

        //     sum += nums[rightIndex];
        //     length ++;

        //     while (sum >= target) {
        //         result = length < result ? length :  result;
        //         sum -= nums[leftIndex++];
        //         length--;
        //     }
        // }

        // return result < Integer.MAX_VALUE ? result : 0;


        // int result = Integer.MAX_VALUE;
        // int leftIndex = 0;
        // int sum = 0;
        // int length = 0;

        // for (int rightIndex = 0; rightIndex < nums.length; rightIndex ++) {
        //     sum += nums[rightIndex];
        //     length++;
        //     while(sum >= target) {

        //         result = length < result ? length : result;
        //         sum -= nums[leftIndex ++];
        //         length --;
        //     }
        // }

        // return result < Integer.MAX_VALUE ? result : 0;

        // int sizeResult = Integer.MAX_VALUE;
        // int size = 0;


        // for (int start = 0; start < nums.length; start++) {
        //     int sum = 0;
        //     for (int end = start; end < nums.length; end++) {
        //         sum += nums[end];
        //         if (sum >= target) {
        //             size = end - start + 1;
        //             sizeResult = sizeResult < size ? sizeResult : size;
        //             break;
        //         }
        //     }
        // }

        // return sizeResult == Integer.MAX_VALUE ? 0 : sizeResult;

        int result = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;
        int size = 0;

        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];

            while (sum >= target) {
                size = end - start + 1;
                result = result < size ? result : size;
                sum -= nums[start++];
            }
        }

        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
// @lc code=end

