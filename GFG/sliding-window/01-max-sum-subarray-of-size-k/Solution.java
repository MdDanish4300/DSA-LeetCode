 class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n = arr.length;
        
        // Edge case
        if (n < k) {
            return 0;
        }
        
        int windowSum = 0;
        
        // Calculate the first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        
        int low = 0;
        int high = k - 1;
        int maxSum = Integer.MIN_VALUE;
        
        // Slide the window
        while (high < n) {
            
            // Update the maximum
            maxSum = Math.max(windowSum, maxSum);
            
            // Move the pointer
            low++;
            high++;
            
            // If high reaches the end, no, now no new element to add
            if (high == n) {
                break;
            }
            
            // Remove the element leaving the window
            windowSum = windowSum - arr[low - 1];
            
            
            // Add the new element entering the window
            windowSum = windowSum + arr[high];
        }
        
        return maxSum;
    }
}
