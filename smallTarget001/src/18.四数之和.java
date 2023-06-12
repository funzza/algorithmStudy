/*
 * @lc app=leetcode.cn id=18 lang=java
 *
 * [18] 四数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int length = nums.length;

        Arrays.sort(nums);

        for (int i = 0; i < length; i++) {

            if (nums[i] > 0 && nums[i] > target) {
                return result;
            }

            if ( i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < length; j++) {

                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int leftIndex = j + 1;
                int rightIndex = length - 1;

                while (leftIndex < rightIndex) {

                    int sum = nums[i] + nums[j] + nums[leftIndex] + nums[rightIndex];

                    if (sum > target) {
                        rightIndex--;
                    } else if (sum < target) {
                        leftIndex++;
                    } else {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[leftIndex]);
                        list.add(nums[rightIndex]);

                        result.add(list);

                        while (leftIndex < rightIndex && nums[leftIndex] == nums[leftIndex + 1]) {leftIndex++;}
                        while (leftIndex < rightIndex && nums[rightIndex] == nums[rightIndex - 1]) {rightIndex--;}
                        
                        leftIndex++;
                        rightIndex--;
                    }
                }
            }
        }


        return result;
    }
}
// @lc code=end

