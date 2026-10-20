class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;

        // Create an array to store the cumulative sum at each index
        int[] prefix = new int[n];

        // The first prefix sum is the first element itself
        prefix[0] = nums[0];

        // Start from index 1 because index 0 is already initialized
        for (int i = 1; i < n; i++) {

            // Current prefix sum = previous prefix sum + current element
            prefix[i] = prefix[i - 1] + nums[i];
        }

        // Return the array containing the running sums
        return prefix;
    }
}