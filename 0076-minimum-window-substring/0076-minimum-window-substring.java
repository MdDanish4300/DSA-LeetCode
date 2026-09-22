class Solution {
    public String minWindow(String s, String t) {

        // Edge case
        if (s.length() == 0 || t.length() == 0) {
            return "";
        }

        int[] have = new int[256];
        int[] needed = new int[256];

        int start = 0;
        int minLenWindow = Integer.MAX_VALUE;
        int minStart = 0;
        int count = 0;

        // Store frequency of characters in t
        for (char ch : t.toCharArray()) {
            needed[ch]++;
        }

        // Sliding Window
        for (int end = 0; end < s.length(); end++) {

            char ch = s.charAt(end);
            have[ch]++;

            // Character contributes to satisfying t
            if (have[ch] <= needed[ch]) {
                count++;
            }

            // Current window contains all required characters
            while (count == t.length()) {

                int windowSize = end - start + 1;

                // Update minimum window
                if (windowSize < minLenWindow) {
                    minLenWindow = windowSize;
                    minStart = start;
                }

                // Remove character from left
                char remove = s.charAt(start);
                have[remove]--;

                // We lost a required character
                if (have[remove] < needed[remove]) {
                    count--;
                }

                start++;
            }
        }

        // No valid window found
        if (minLenWindow == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(minStart, minStart + minLenWindow);
    }
}