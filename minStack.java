package STS;

import java.util.Stack;
class MinStack {
    private Stack<Pair<Integer, Integer>> stack; // Stack of {value, minTillNow}

    // Constructor
    public MinStack() {
        stack = new Stack<>();
    }

    // Push element onto stack
    public void push(int val) {
        int minVal = stack.isEmpty() ? val : Math.min(val, stack.peek().getSecond());
        stack.push(new Pair<>(val, minVal));
    }

    // Pop top element
    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
        } else {
            System.out.println("Stack Underflow");
        }
    }

    // Get top element
    public int top() {
        if (!stack.isEmpty()) {
            return stack.peek().getFirst();
        }
        System.out.println("Stack is empty");
        return -1;
    }

    // Get minimum element
    public int getMin() {
        if (!stack.isEmpty()) {
            return stack.peek().getSecond();
        }
        System.out.println("Stack is empty");
        return -1;
    }

    // Helper class to store a pair (value, minTillNow)
    static class Pair<T, U> {
        private final T first;
        private final U second;

        public Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public U getSecond() {
            return second;
        }
    }

    // Driver Code
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(10);
        minStack.push(20);
        minStack.push(5);
        minStack.push(8);

        System.out.println("Minimum Element: " + minStack.getMin()); // Output: 5
        minStack.pop();
        System.out.println("Minimum Element: " + minStack.getMin()); // Output: 5
        minStack.pop();
        System.out.println("Minimum Element: " + minStack.getMin()); // Output: 10
    }
}
