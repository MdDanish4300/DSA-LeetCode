class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int n = nums.length;
        int diff = Integer.MAX_VALUE;
        int resSum = 0;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int total_sum = nums[i] + nums[left] + nums[right];
                int d = Math.abs(target - total_sum);

                // Main logic of the program.
                if (d < diff) {
                    diff = d;
                    resSum = total_sum;
                }
                
                // Now here we have compare and move pointers.
                if (total_sum == target) {
                    return resSum;

                } else if (total_sum < target) {
                    left++;

                } else {
                    right--;
                }
            }
        }

        return resSum;
    }
}