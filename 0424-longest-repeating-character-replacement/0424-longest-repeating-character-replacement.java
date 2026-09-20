class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];

        int left = 0;
        int maxFreq = 0;
        int maxWindow = 0;

        for (int right = 0; right < s.length(); right++) {

            // Count the frequency of the current character.
            freq[s.charAt(right) - 'A']++;

            // Keep track of the highest character frequency in the window.
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            int windowLength = right - left + 1;

            // If replacements needed are more than k, shrink the window.
            if (windowLength - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            // Update the maximum valid window length.
            windowLength = right - left + 1;
            maxWindow = Math.max(maxWindow, windowLength);
        }

        return maxWindow;
    }
}