import java.util.HashMap;
import java.util.Set;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=904 lang=java
 *
 * [904] 水果成篮
 */

// @lc code=start
class Solution {
    public int totalFruit(int[] fruits) {


        // Set<Integer> set = new HashSet<> ();
        // int result = 0;
        // int length = 0;
        // int leftIndex = 0;
        
        // for (int rightIndex = 0; rightIndex < fruits.length; rightIndex++) {
            
        //     if (!set.contains(fruits[rightIndex])) {
        //         set.add(fruits[rightIndex]);
        //     }
        //     length++;
        //     if (set.size() > 2) {

        //         int temp = fruits[--rightIndex];
        //         while(fruits[rightIndex] == temp) {
        //             rightIndex --;
        //         }
        //         rightIndex ++;

        //         length = 1;
        //         set.remove(fruits[leftIndex++]);
        //     }
        //     result = length > result ? length : result;
        // }

        // return result;

        // int result = 0;
        // int start = 0;
        // int size = 0;

        // HashMap<Integer, Integer> map = new HashMap<>();

        // for (int end = 0; end < fruits.length; end++) {
        //     map.put(fruits[end], map.getOrDefault(fruits[end], 0) + 1);
        //     size = end - start + 1;
        //     while (map.size() >= 3) {
        //         // 开始滑动该窗口
        //         map.put(fruits[start], map.get(fruits[start]) - 1);
        //         if (map.get(fruits[start]) == 0) {
        //             map.remove(fruits[start]);
        //         }
        //         start++;
        //         size = end - start + 1;
        //     }
        //     result = result > size ? result : size;
        // }

        // return result;


        int result = 0;
        int start = 0;
        // int size = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int end = 0; end < fruits.length; end++) {
            map.put(fruits[end], map.getOrDefault(fruits[end], 0) + 1);
            // size = end - start + 1;
            while (map.size() >= 3) {
                // 开始滑动该窗口
                map.put(fruits[start], map.get(fruits[start]) - 1);
                if (map.get(fruits[start]) == 0) {
                    map.remove(fruits[start]);
                }
                start++;
                // size = end - start + 1;
            }
            result = Math.max(result, end - start + 1);
        }

        return result;

    }
}
// @lc code=end

