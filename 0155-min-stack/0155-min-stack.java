import java.util.Stack;

class MinStack {

    // Stack to store pairs of (value, current minimum)
    private Stack<int[]> stack;

    public MinStack() {
        // Initialize the stack
        stack = new Stack<>();
    }
    
    public void push(int val) {
        if (stack.isEmpty()) {
            // If the stack is empty, the current minimum is the value itself
            stack.push(new int[] {val, val});
        } else {
            // Otherwise, push the value and the minimum of the stack
            int currentMin = Math.min(val, stack.peek()[1]);
            stack.push(new int[] {val, currentMin});
        }
    }
    
    public void pop() {
        if (!stack.isEmpty()) {
            // Pop the top element
            stack.pop();
        }
    }
    
    public int top() {
        if (!stack.isEmpty()) {
            // Return the top element (value part)
            return stack.peek()[0];
        }
        return -1; // Return -1 or handle empty case if needed
    }
    
    public int getMin() {
        if (!stack.isEmpty()) {
            // Return the current minimum (second part of the pair)
            return stack.peek()[1];
        }
        return -1; // Return -1 or handle empty case if needed
    }
}
