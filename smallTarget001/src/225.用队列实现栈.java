import java.util.Queue;

/*
 * @lc app=leetcode.cn id=225 lang=java
 *
 * [225] 用队列实现栈
 */

// @lc code=start
class MyStack {

    Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>(); 
    }
    
    public void push(int x) {
        queue.add(x);

        for (int i = 0; i < queue.size(); i++) {
            int temp = queue.p
        }
    }
    
    public int pop() {

    }
    
    public int top() {

    }
    
    public boolean empty() {

    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

