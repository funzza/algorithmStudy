import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map<Integer, Integer> map = new HashMap<>();
        // int[] res = new int[2];

        // if (nums == null || nums.length == 0) {
        //     return res;
        // }

        // for (int i = 0; i < nums.length; i++) {
        //     if (map.containsKey(target - nums[i])) {
        //         res[1] = i;
        //         res[0] = map.get(target - nums[i]);
        //     } else {
        //         map.put(nums[i], i);
        //     }
        // }

        // return res;

        // int[] result = new int[2];
        // Map<Integer, Integer> map = new HashMap<>();

        // if (nums == null || nums.length == 0) {
        //     return result;
        // }

        // for (int i = 0; i < nums.length; i++) {
        //      if (map.containsKey(target - nums[i])) {
        //          result[1] = i;
        //          result[0] = map.get(target - nums[i]);
        //          return result;
        //      } else {
        //          map.put(nums[i], i);
        //      }
        // }

        // return result;

        // int[] result = new int[2];
        // Map<Integer, Integer> map = new HashMap<>();

        // for (int i = 0; i < nums.length; i++) {
        //     if (map.containsKey(target - nums[i])) {
        //         result[1] = i;
        //         result[0] = map.get(target - nums[i]);
        //     } else {
        //         map.put(nums[i], i);
        //     }
        // }
        // return result;

        // Map<Integer, Integer> map = new HashMap<>();
        // int[] result = new int[2];
        // for (int i = 0; i < nums.length; i++) {
        //     if (map.containsKey(target - nums[i])) {
        //         result[0] = map.get(target - nums[i]);
        //         result[1] = i;
        //         break;
        //     } else {
        //         map.put(nums[i], i);
        //     }
        // }

        // return result;

        int[] result = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                break;
            }

            map.put(nums[i], i);
            
        }


        return result;
        
    }
}
// @lc code=end

