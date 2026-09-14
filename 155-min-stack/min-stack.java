import java.util.Stack;

class Node {
    int val;
    int min;

    public Node(int v, int m) {
        this.val = v;
        this.min = m;
    }
}

class MinStack {
    Stack<Node> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int value) {
        if (stack.isEmpty()) {
            stack.push(new Node(value, value));
            return;
        }

        Node nodeTop = stack.peek();
        int minTop = nodeTop.min;

        if (value < minTop)
            stack.push(new Node(value, value));
        else
            stack.push(new Node(value, minTop));
    }

    public void pop() {
        if (!stack.isEmpty()) stack.pop();
    }

    public int top() {
        return stack.peek().val;
    }

    public int getMin() {
        return stack.peek().min;
    }
}