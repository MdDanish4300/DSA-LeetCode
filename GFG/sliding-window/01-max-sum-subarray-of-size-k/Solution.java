class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n = arr.length;
        
        // Edge case
        if (n < k) {
            return 0;
        }
        
        int windowSum = 0;
        
        // Calculate the current window Sum.
        for(int i=0; i<k; i++) {
            windowSum += arr[i];
        }
        
        int maxSum = windowSum;
        
        // Pointers to Slide the winodow
        int low = 0;
        
        // Sliding the window
        for(int high=k-1 ; high < n - 1; high++) {
            
            windowSum -= arr[low];  // Removing the last element from the arr.
            
            low++;
            
            windowSum += arr[high + 1]; // Adding the new element in the arr.
             
            maxSum = Math.max(windowSum, maxSum);
            
        }
        
        return maxSum;
    }
}
