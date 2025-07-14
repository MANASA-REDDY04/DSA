class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] ng = new int[n];
        int m = 2 * n - 1;
        for (int i = m; i >= 0; i--) {
            if (st.isEmpty()) {
                if (i < n)
                    ng[i] = -1;
            } else {
                if (i < n) {
                    while (!st.isEmpty() && st.peek() <= nums[i]) {
                        st.pop();
                    }
                      if (st.isEmpty())
                    ng[i] = -1;
                else
                    ng[i] = st.peek();
                } else {
                    while (!st.isEmpty() && st.peek() <= nums[i - n]) {
                        st.pop();
                    }
                }
            }
            if (i < n)
                st.push(nums[i]);
            else
                st.push(nums[i - n]);
        }
        return ng;
    }
}