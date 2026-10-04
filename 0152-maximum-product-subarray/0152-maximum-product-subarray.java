class Solution {
    public int maxProduct(int[] nums) {

        // Maximum product of a subarray ending at the current index
        int maxEndingProduct = nums[0];

        // Minimum product of a subarray ending at the current index
        // Keep this because a negative number can turn it into a maximum
        int minEndingProduct = nums[0];

        // Maximum product found anywhere in the array
        int maxProduct = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // Three choices for a subarray ending at the current element:
            // 1. Start a new subarray
            // 2. Extend the previous minimum-product subarray
            // 3. Extend the previous maximum-product subarray
            int startNew = nums[i];
            int extendMin = minEndingProduct * nums[i];
            int extendMax = maxEndingProduct * nums[i];

            // Find the maximum and minimum product ending at this index
            maxEndingProduct = Math.max(startNew,
                    Math.max(extendMin, extendMax));

            minEndingProduct = Math.min(startNew,
                    Math.min(extendMin, extendMax));

            // Update the overall maximum product
            maxProduct = Math.max(maxProduct, maxEndingProduct);
        }

        return maxProduct;
    }
}