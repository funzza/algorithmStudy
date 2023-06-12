import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=350 lang=java
 *
 * [350] 两个数组的交集 II
 */

// @lc code=start
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        // Map<Integer, Integer> nums1Map = new HashMap<>();
        // Map<Integer, Integer> nums2Map = new HashMap<>();

        // for (int num : nums1) {
        //     nums1Map.put(num, nums1Map.getOrDefault(num, 0) + 1);
        // }

        // for (int num : nums2) {
        //     nums2Map.put(num, nums2Map.getOrDefault(num, 0) + 1);
        // }

        // List<Integer> result = new ArrayList<>();

        // for(Integer i : nums1Map.keySet()) {
        //     for (Integer j : nums2Map.keySet()) {
        //         if (i.equals(j)) {
        //             // result[index++] = nums1Map.get(i) < nums2Map.get(j) ? nums1Map.get(i) : nums2Map.get(j);
        //             for (int k = 0; k < Math.min(nums1Map.get(i), nums2Map.get(j)); k++) {
        //                 result.add(i);
        //             }
        //         }
        //     }
        // }


        // Integer[] integers = result.toArray(new Integer[result.size()]);

        // int[] t = new int[integers.length];

        // for (int i = 0; i < integers.length; i++) {
        //     t[i] = integers[i];
        // }


        // return  t;

        Map<Integer, Integer> map = new HashMap<>();

        List<Integer> list = new ArrayList<>();

        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            if (map.containsKey(num)) {
                list.add(num);
                map.put(num, map.get(num) - 1);
                if (map.get(num) == 0) {
                    map.remove(num);
                }
            }
        }
        
        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}
// @lc code=end

