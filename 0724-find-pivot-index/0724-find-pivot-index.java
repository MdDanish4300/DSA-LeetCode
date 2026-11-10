class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;

        // Calculate the total sum of the array.
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        // Traverse the array and check each index as a pivot.
        for (int i = 0; i < n; i++) {

            // Right sum = Total sum - Left sum - Current element.
            int rightSum = totalSum - leftSum - nums[i];

            // Check if left and right sums are equal.
            if (leftSum == rightSum) {
                return i;
            }

            // Add the current element to the left sum for the next iteration.
            leftSum += nums[i];
        }

        return -1; // No pivot index found.
    }
}