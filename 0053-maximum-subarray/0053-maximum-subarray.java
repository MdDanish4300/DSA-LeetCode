class Solution {
    public int maxSubArray(int[] nums) {

        // Best subarray sum ending at the current index
        int bestEnding = nums[0];

        // Maximum subarray sum found so far
        int ans = nums[0];

        for(int i = 1; i < nums.length; i++) {

            // Choice 1: Extend the previous subarray
            int v1 = bestEnding + nums[i];

            // Choice 2: Start a new subarray from the current element
            int v2 = nums[i];

            // Choose the better option: extend or start fresh
            bestEnding = Math.max(v1, v2);

            // Update the overall maximum subarray sum
            ans = Math.max(ans, bestEnding);
        }

        return ans;
    }
}