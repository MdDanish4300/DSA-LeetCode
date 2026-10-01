class Solution {
    private int getNext(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {

        int slow = n;
        int fast = n;

        while (true) {

            // Slow moves one step
            slow = getNext(slow);

            // Fast moves two steps
            fast = getNext(getNext(fast));

            // If fast reaches 1, n is a happy number
            if (fast == 1) {
                return true;
            }

            // If they meet, we found a cycle
            if (slow == fast) {
                return false;
            }
        }
    }
}