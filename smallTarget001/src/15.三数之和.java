import java.util.Map;

/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 */

/*
 * 拿这个nums数组来举例，首先将数组排序，然后有一层for循环，i从下标0的地方开始，同时定一个下标left 定义在i+1的位置上，定义下标right 在数组结尾的位置上。

依然还是在数组中找到 abc 使得a + b +c =0，我们这里相当于 a = nums[i]，b = nums[left]，c = nums[right]。

接下来如何移动left 和right呢， 如果nums[i] + nums[left] + nums[right] > 0 就说明 此时三数之和大了，因为数组是排序后了，所以right下标就应该向左移动，
这样才能让三数之和小一些。

如果 nums[i] + nums[left] + nums[right] < 0 说明 此时 三数之和小了，left 就向右移动，才能让三数之和大一些，直到left与right相遇为止。
 */

// @lc code=start
class Solution {
  public List<List<Integer>> threeSum(int[] nums) {

		List<List<Integer>> result = new ArrayList<>();

		Arrays.sort(nums);

		if (nums[0] > 0) {
			return result;
		}

        int length = nums.length;

		for (int i = 0; i < length; i++) {

			if ( i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}

			int leftIndex = i + 1;
			int rightIndex = length - 1;

			while (leftIndex < rightIndex) {
				
				int sum = nums[i] + nums[leftIndex] + nums[rightIndex];
				
				if (sum > 0) {
					rightIndex--;
                } else if (sum < 0) {
					leftIndex++;
					// while (leftIndex < rightIndex && nums[leftIndex] == nums[leftIndex + 1]) {leftIndex++;}
				} else if (sum == 0) {
					List<Integer> list = new ArrayList<>();
					list.add(nums[i]);
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

		return result;
  }
}
// @lc code=end

