class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        int low = 0;
        int ans = 0;

        Map <Character, Integer> freq = new HashMap<>();

        for(int high = 0; high < n; high++) {
            
            // Add the current character to map.
            char currentChar = s.charAt(high);
            freq.put(currentChar, freq.getOrDefault(currentChar, 0) + 1);

            while (freq.get(currentChar) > 1) {
                char leftChar = s.charAt(low);

                // decrease frequency
                freq.put(leftChar, freq.get(leftChar) - 1);

                // Remove the charcter if its frequency becomes 0.
                if (freq.get(leftChar) == 0) {
                    freq.remove(leftChar);
                }

                low++; // Move the low pointer.

            }

            ans = Math.max(ans, high - low + 1);
        }

        return ans;
    }
}