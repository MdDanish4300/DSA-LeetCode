class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int i = 0;

        for(int j = i+1; j < nums.length; j++) {
            if (nums[i] == nums[j]) {
                // do nothing

            } else if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
                k = k + 1;
            }  
        }
        return k;
    }
}