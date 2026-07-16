class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] result = new int [nums.length];

        // Square of all elements
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        int head = 0;
        int tail = nums.length - 1;

        for (int idx = nums.length - 1; idx >= 0; idx--) {

            if (nums[head] > nums[tail]) {
                result[idx] = nums[head++];   // Increment the head pointer
            } else {
                result[idx] = nums[tail--];   // Decrement the tail pointer
            }
        }
        return result;
    }
}