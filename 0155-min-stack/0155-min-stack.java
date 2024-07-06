class MinStack {
    long minElement;
    Stack<Long> s = new Stack<>();

    public MinStack() {
    }

    public void push(int val) {
        long value = val;
        if (s.isEmpty()) {
            s.push(value);
            minElement = value;
        } else {
            if (value >= minElement) {
                s.push(value);
            } else {
                s.push(2 * value - minElement);
                minElement = value;
            }
        }
    }

    public void pop() {
        if (s.size() == 0) {
            return;
        } else {
            if (s.peek() >= minElement) {
                s.pop();
            } else if (s.peek() < minElement) {
                minElement = 2 * minElement - s.peek();
                s.pop();
            }
        }
    }

    public int top() {
        if (s.size() == 0) {
            return -1;
        } else {
            if (s.peek() >= minElement) {
                return s.peek().intValue();
            } else {
                return (int) minElement;
            }
        }
    }

    public int getMin() {
        if (s.size() == 0) {
            return -1;
        }
        return (int) minElement;
    }
}
