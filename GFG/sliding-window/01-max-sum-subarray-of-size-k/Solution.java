class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n = arr.length;
        
        // Edge case
        if (n < k) {
            return 0;
        }
        
        int currWindowSum = 0;
        
        // 1. Calculate the sum of first window.
        for(int i = 0; i < k; i++) {
            currWindowSum += arr[i];
        }
        
        int maxSum = currWindowSum;
        
        // Pointers for the current window.
        int low = 0;
        int high = k - 1;
        
        // 2. Slide the window
        while (high < n - 1) {
            
            // Remove the element leaving the window.
            currWindowSum -= arr[low];
            
            low++;  // Move the low pointer.
            high++; // Move the high pointer.
            
            // Add the element entering the window
            currWindowSum += arr[high];
            
            // Update the maximum
            maxSum = Math.max(currWindowSum, maxSum);
        }
        
        return maxSum;
    }
}
