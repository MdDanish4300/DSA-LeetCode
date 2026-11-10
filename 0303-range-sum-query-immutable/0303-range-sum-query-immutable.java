class NumArray {
    // Class-level variable to store Prefix Sum array
    private int[] prefix;

    // Constructor : Build the Prefix Sum array
    public NumArray(int[] nums) {
        int n = nums.length;

        prefix = new int[n];

        // Initialize the first element 
        prefix[0] = nums[0];

        // Calculate the remaining Prefix Sum Values
        for(int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {

        // If the ranges start from 0
        if (left == 0) {
            return prefix[right];
        }

        // Otherwise, subtract the sum before the last left index
        return prefix[right] - prefix[left - 1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */