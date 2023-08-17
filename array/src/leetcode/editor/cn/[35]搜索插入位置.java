//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。 
//
// 请必须使用时间复杂度为 O(log n) 的算法。 
//
// 
//
// 示例 1: 
//
// 
//输入: nums = [1,3,5,6], target = 5
//输出: 2
// 
//
// 示例 2: 
//
// 
//输入: nums = [1,3,5,6], target = 2
//输出: 1
// 
//
// 示例 3: 
//
// 
//输入: nums = [1,3,5,6], target = 7
//输出: 4
// 
//
// 
//
// 提示: 
//
// 
// 1 <= nums.length <= 10⁴ 
// -10⁴ <= nums[i] <= 10⁴ 
// nums 为 无重复元素 的 升序 排列数组 
// -10⁴ <= target <= 10⁴ 
// 
//
// Related Topics 数组 二分查找 👍 2108 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0 || target < nums[0]) {
            return 0;
        }
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (target > nums[middle]) {
                if (target < nums[middle + 1]) {
                    return middle + 1;
                }
                left = middle + 1;
            } else if (target < nums[middle]) {
                if (target > nums[middle - 1]) {
                    return middle;
                }
                right = middle - 1;
            } else {
                return middle;
            }
        }

        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
