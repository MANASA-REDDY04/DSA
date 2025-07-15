class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int mod= (int)(1e9+7);

        int[] nse = new int[n];
        int[] psee = new int[n];

        Stack<Integer> st =  new Stack<>();
        for(int i = n-1; i >= 0; i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) st.pop();
            nse[i] = st.isEmpty()? n-i : st.peek()-i;
            st.push(i);
        }
        st.clear();
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]) st.pop();
            psee[i] = st.isEmpty()? (i+1) : (i-st.peek());
            st.push(i);
        }
        int total = 0;
        for(int i = 0; i < n; i++)
        total = (int)((long)total + ((nse[i]*1L)*(psee[i]*1L)%mod)*arr[i]*1L%mod)%mod;
        return total;
    }
}