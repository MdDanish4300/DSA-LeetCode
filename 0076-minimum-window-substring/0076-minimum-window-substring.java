class Solution {
    public String minWindow(String s, String t) {

        // Edge case 
        if (s.length() == 0 || t.length() == 0) {
            return "";
        }
        
        // Frequency of characters required in t.
        int[] freq = new int[128];
        
        for(char ch : t.toCharArray()) {
            freq[ch]++;
        }

        int low = 0;
        int count = 0; // Number of required characters satisfied
        int minLength = Integer.MAX_VALUE;
        int start = 0;

        for(int high = 0; high < s.length(); high++) {

            char ch = s.charAt(high);

            // If this character is still needed
            if (freq[ch] > 0) {
                count++;
            }

            // Decrease the requirement / track window
            freq[ch]--;

            while (count == t.length()) {

                // Update minimum window
                if (high - low + 1 < minLength) {
                    minLength = high - low + 1;
                    start = low;
                }

                char leftChar = s.charAt(low);

                // Put the character back into requirement
                freq[leftChar]++;

                // If the frequency becomes positive 
                // we have lost a required character
                if (freq[leftChar] > 0 ) {
                    count--;
                }

                low++;
            }
        }

        // No valid window length
        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLength);
    }
}