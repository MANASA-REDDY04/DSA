class Solution {
    public int findDuplicate(int[] nums) {
        // Step 1: Find intersection point inside the cycle
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];          // move 1 step
            fast = nums[nums[fast]];    // move 2 steps
        } while (slow != fast);

        // Step 2: Find entrance to the cycle (duplicate number)
        slow = nums[0];  // move slow back to start

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow; // or fast (both are duplicate)
    }
}
