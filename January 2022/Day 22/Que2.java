// Que link: https://leetcode.com/problems/implement-queue-using-stacks/
// 232. Implement Queue using Stacks

class MyQueue {

    private final Stack<Integer> inputbuf;
    private final Stack<Integer> output;
    
    // Initialize your data structure here
    public MyQueue() {
        inputbuf = new Stack<Integer>();
        output = new Stack<Integer>();
    }
    
    // Push element x to the back of queue
    public void push(int x) {
        inputbuf.push(x);
    }
    
    // Removes the element from in front of queue and returns that element
    public int pop() {
        peek();
        return output.pop();
    }
    
    // Get the front element
    public int peek() {
        if (output.empty()) {
            while (!inputbuf.empty()) {
                output.push(inputbuf.pop());
            }
        }
        return output.peek();
    }
    
    // Returns whether the queue is empty
    public boolean empty() {
        return inputbuf.empty() && output.empty();
    }
}