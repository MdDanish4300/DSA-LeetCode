class Solution {
    public int findDuplicate(int[] nums) {

        // Start both the pointers from 0.
        int slow = 0;
        int fast = 0;

        // Phase 1 : Find the meeting point inside the cycle
        while (true) {

            // slow moves 1 step
            slow = nums[slow];

            // Fast moves 2 steps
            // First nums[fast] -> moves 1 step
            // Secons nums[nums[fast]] -> moves another step
            fast = nums[nums[fast]];

            // If they meet, we are inside cycle 
            if (slow == fast) {
                break;
            }
        }

        // Phase 2 : Find the entrance of the cycle 
        // The entrance of the cycle is the duplicate number.
        slow = 0;

        // Move both of pointers 1 step at a time.
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];           
        }

        // They meet at the duplicate number
        return slow;
    }
}