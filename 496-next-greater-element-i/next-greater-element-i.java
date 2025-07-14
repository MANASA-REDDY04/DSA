class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = nums2.length;
        Stack<Integer> st = new Stack<>();
        for(int i = n-1; i >= 0; i--){
            if(st.isEmpty()){
                hm.put(nums2[i],-1);
            }else{
                while(!st.isEmpty() && st.peek() <= nums2[i]){
                    st.pop();
                }
                if(st.isEmpty()) hm.put(nums2[i],-1);
                else hm.put(nums2[i],st.peek());
            }
            st.push(nums2[i]);
        }
        int m = nums1.length;
        int[] ans = new int[m];
        for(int i = 0; i < m; i++)
        ans[i] = hm.get(nums1[i]);
        return ans;
    }
}