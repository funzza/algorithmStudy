//给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。 
//
// 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [-4,-1,0,3,10]
//输出：[0,1,9,16,100]
//解释：平方后，数组变为 [16,1,0,9,100]
//排序后，数组变为 [0,1,9,16,100] 
//
// 示例 2： 
//
// 
//输入：nums = [-7,-3,2,3,11]
//输出：[4,9,9,49,121]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁴ 
// -10⁴ <= nums[i] <= 10⁴ 
// nums 已按 非递减顺序 排序 
// 
//
// 
//
// 进阶： 
//
// 
// 请你设计时间复杂度为 O(n) 的算法解决本问题 
// 
//
// Related Topics 数组 双指针 排序 👍 867 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sortedSquares(int[] nums) {

        if (nums[0] >= 0) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = nums[i] * nums[i];
            }
            return nums;
        } else if (nums[nums.length - 1] < 0) {

            int[] result = new int[nums.length];
            int index = 0;
            for (int i = nums.length - 1; i >= 0 ; i--) {
                result[index++] = nums[i] * nums[i];
            }
            return result;
        }

        int leftIndex = 0;
        int rightIndex = nums.length - 1;

        int[] result = new int[nums.length];

        for (int i = result.length - 1; i >= 0; i--) {
            int left = nums[leftIndex] * nums[leftIndex];
            int right = nums[rightIndex] * nums[rightIndex];

            if (left > right) {
                result[i] = left;
                leftIndex++;
            } else {
                result[i] = right;
                rightIndex--;
            }
        }

        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
