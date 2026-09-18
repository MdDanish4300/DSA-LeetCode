class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int low = 0;

        int currSum = 0;
        int minLenWindow = Integer.MAX_VALUE;

        for(int high = 0; high < n; high++) {
            currSum += nums[high];

            while (currSum >= target) {
                int currWindowLen = high - low + 1;

                minLenWindow = Math.min(minLenWindow, currWindowLen);
                currSum -= nums[low];
                low++;
            }
        }

        return minLenWindow == Integer.MAX_VALUE ? 0 : minLenWindow;

    }
}