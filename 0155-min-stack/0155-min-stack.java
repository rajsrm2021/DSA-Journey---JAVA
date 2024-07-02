class MinStack {

    Stack<Integer> s = new Stack<>();
    Stack<Integer> ss = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {

        s.push(val);

        if(ss.size()==0 || ss.peek()>=val){
            ss.push(val);
        }
        
    }
    
    public void pop() {

        if(s.size()==0) return;

        int ans = s.pop();

        if(ans == ss.peek() )  ss.pop();
        
        
    }
    
    public int top() {

        if(s.size()==0) return -1;

        return s.peek();
        
    }
    
    public int getMin() {

        if(ss.isEmpty()) return -1;

        return ss.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */