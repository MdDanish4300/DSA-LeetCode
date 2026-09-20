class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int zeros = 0;
        int ans = 0;

        for (int right = 0; right < nums.length; right++) {
            
            // Count the zero added to the current window.
            if (nums[right] == 0) {
                zeros++;
            }

            // Shrink the window if zeros exceed k.
            while (zeros > k) {
                // Decrease zero count if removing a zero.
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }

            // Update the maximum valid window length.
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}