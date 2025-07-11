class MinStack {
    Stack<Long> st;
    long minele;
    public MinStack() {
        st = new Stack<>();
        minele = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if(st.isEmpty()){ 
            st.push((long)0L);
            minele = val;
        }
        else{
            st.push((long)val-minele);
            if(val < minele) minele = val;
        }
    }
    
    public void pop() {
        if(st.isEmpty()) return;
        long val = st.pop();
        if(val < 0) minele = minele - val;
    }
    
    public int top() {
        if(st.isEmpty()) return -1;
        long val = st.peek();
        if(val <= 0) return (int)minele;
        else return (int)(val + minele);
    }
    
    public int getMin() {
        return (int)minele;
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