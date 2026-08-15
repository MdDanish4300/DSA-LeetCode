class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLenWindow = Integer.MAX_VALUE;
        int currSum = 0;

        // To slide and shrink the window we need to have pointers.
        int low = 0;
        int high = 0;

        // Find the currSum and increase the window size.
        while (high < nums.length) {
            currSum += nums[high];
            high++;

            // Shrink the window while condition is satisfied.
            while (currSum >= target) {

                int currWindowSize = high - low;

                minLenWindow = Math.min(minLenWindow, currWindowSize);

                currSum -= nums[low];
                low++;
            }
        }

        return minLenWindow == Integer.MAX_VALUE ? 0 : minLenWindow;
    }
}