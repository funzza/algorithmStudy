/*
 * @lc app=leetcode.cn id=977 lang=java
 *
 * [977] 有序数组的平方
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] nums) {
        
        // for (int i = 0; i < nums.length; i++) {
        //     nums[i] *= nums[i];
        // }

        // for (int i = 0; i < nums.length - 1; i++) {
        //     for (int j = 0; j < nums.length - i - 1; j++) {
        //         if (nums[j] > nums[j + 1]) {
        //             int temp = nums[j];
        //             nums[j] = nums[j + 1];
        //             nums[j + 1] = temp; 
        //         }
        //     }
        // }
        // return nums;

        // int size = nums.length;
        // int[] result = new int[size];
        // int leftIndex = 0;
        // int rightIndex = size - 1;

        // for (int i = size - 1; i >= 0; i--) {

        //     if (nums[leftIndex] * nums[leftIndex] > nums[rightIndex] * nums[rightIndex]) {
        //         result[i] = nums[leftIndex] * nums[leftIndex];
        //         leftIndex ++;
        //     } else {
        //         result[i] = nums[rightIndex] * nums[rightIndex];
        //         rightIndex--;
        //     }
        // }
        // return result;


 
        // int size = nums.length;
        // int[] result = new int[size];
        // int leftIndex = 0;
        // int rightIndex = size - 1;

        // for (int i = size - 1; i >= 0; i --) {
        //     int leftSquare = nums[leftIndex] * nums[leftIndex];
        //     int rightSquare = nums[rightIndex] * nums[rightIndex];

        //     if (leftSquare >= rightSquare) {
        //         result[i] = leftSquare;
        //         leftIndex++;
        //     } else {
        //         result[i] = rightSquare;
        //         rightIndex--;
        //     }
        // }

        // return result;

        int leftIndex = 0;
        // int size = nums.length;
        int rightIndex = nums.length - 1;
        int[] result = new int[nums.length];

        for (int i = nums.length - 1; i >= 0; i--) {
            // int leftSquare = nums[leftIndex] * nums[leftIndex];
            // int rightSquare = nums[rightIndex] * nums[rightIndex];

            result[i] = nums[leftIndex] * nums[leftIndex] > nums[rightIndex] * nums[rightIndex] ? nums[leftIndex] * nums[leftIndex++] : nums[rightIndex] * nums[rightIndex--];
        }

        return result;


    }
}
// @lc code=end

