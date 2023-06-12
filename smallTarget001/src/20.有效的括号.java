/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        // if (s.length() % 2 != 0) {
        //     return false;
        // }

        // int leftIndex = 0;
        // int rightIndex = s.length() - 1;
        // char[] chars = s.toCharArray();
        // while (leftIndex < rightIndex) {
        //     if ((chars[leftIndex] == '(' && chars[rightIndex] == ')') ||
        //             (chars[leftIndex] == '{' && chars[rightIndex] == '}') ||
        //             (chars[leftIndex] == '[' && chars[rightIndex] == ']')) {
        //         leftIndex++;
        //         rightIndex--;
        //     } else {
        //         return false;
        //     }

        // }

        // return true;

        // if (s.length() % 2 != 0) {
        //     return false;
        // }

        // char[] chars = s.toCharArray();
        // Stack<Character> stack = new Stack<>();

        // for (char c : chars) {
        //     switch (c) {
        //         case '(':
        //             stack.push(')');
        //             break;
        //         case '{':
        //             stack.push('}');
        //             break;
        //         case '[':
        //             stack.push(']');
        //             break;
        //         default:
        //             if (stack.isEmpty() || c != stack.pop()) {
        //                 return false;
        //             }
        //     }
        // }
        
        // return stack.isEmpty();


        Stack<Character> stack = new Stack<>();

        char[] charArray = s.toCharArray();
      for (char c : charArray) {
        switch(c) {
            case '{' :
            stack.push('}');
            break;
            case '(' :
            stack.push(')');
            break;
            case '[' :
            stack.push(']');
            break;
            default:
            if (stack.isEmpty() || c != stack.pop()) {
                return false;
            }
        }
      }
        return stack.isEmpty();
    }
}
// @lc code=end

