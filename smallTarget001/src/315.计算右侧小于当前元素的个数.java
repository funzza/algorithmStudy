/*
 * @lc app=leetcode.cn id=315 lang=java
 *
 * [315] 计算右侧小于当前元素的个数
 */

// @lc code=start
class Solution {
    public List<Integer> countSmaller(int[] nums) {

        int left = 0;
        int right = nums.length;
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = nums[i];
        }
        process(nums, left, right);


    }

    public void process(int[] nums,  int left, int right) {
        
        if (left == right) {
            return;
        }

        int mid = left + ((right - left) >> 1);

        process(nums, left, mid);
        process(nums, mid + 1, right);
        merge(nums, left, mid, right);
        
    }

    public void merge(int[] nums, int left, int mid, int right) {

        int[] help = new int[right - left + 1];
        int helpIndex = 0;
        int leftIndex = left;
        int rightIndex = mid + 1;

        while (leftIndex <= mid && rightIndex <= right) {
            
            help[helpIndex++ ] = nums[leftIndex] < nums[rightIndex] ? nums[leftIndex++] : nums[rightIndex++];
        }

        while (leftIndex <= mid) {
            help[helpIndex++] = nums[leftIndex++];
        }
        while (rightIndex <= right) {
            help[helpIndex] = nums[rightIndex++];
        }

        for (int i = 0; i < help.length; i++) {
            nums[left++] = help[i];
        }
    }
}
// @lc code=end

