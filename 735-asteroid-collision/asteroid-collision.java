class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int ast: asteroids){
            while(!st.isEmpty() && ast < 0 && st.peek() > 0){
                int top = st.pop();
                if(top == -ast){
                    ast = 0;
                    break;
                }else if(top > -ast){
                    ast = top;
                }
            }
            if(ast != 0) st.push(ast);
        }
        int[] res = new int[st.size()];
        for(int i = res.length-1; i >= 0; i--){
            res[i] = st.pop();
        }
        return res;
    }
}