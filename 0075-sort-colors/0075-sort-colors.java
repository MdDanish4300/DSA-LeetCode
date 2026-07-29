class Solution {
    public void sortColors(int[] nums) {

        int zero = 0;
        int one = 0;
        int two = 0;

        // Count the number of 0s, 1s, and 2s
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero++;
            } else if (nums[i] == 1) {
                one++;
            } else {
                two++;
            }
        }

        // Overwrite the array
        int index = 0;

        while (zero > 0) {
            nums[index] = 0;
            index++;
            zero--;
        }

        while (one > 0) {
            nums[index] = 1;
            index++;
            one--;
        }

        while (two > 0) {
            nums[index] = 2;
            index++;
            two--;
        }
    }
}